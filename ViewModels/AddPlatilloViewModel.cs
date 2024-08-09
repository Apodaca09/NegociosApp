using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using CommunityToolkit.Mvvm.Messaging;
using Negocios.Models;
using Negocios.Services;

namespace Negocios.ViewModels
{
    public partial class AddPlatilloViewModel : ObservableObject
    {
        private readonly oBaseDatos _operaciones; 
        [ObservableProperty]
        private byte[] _imageData;
        [ObservableProperty]
        private string _nombre;
        [ObservableProperty]
        private string _descripcion;
        [ObservableProperty]
        private double _precio;
        [ObservableProperty]
        private string _tipo;

        [ObservableProperty]
        private string title;
        [ObservableProperty]
        private string message;
        [ObservableProperty]
        private bool isOpen;
        [ObservableProperty]
        private bool isOpenCancel;

        public string[] Tipos { get; set; } = new string[] { "Platillo", "Bebida" };

        public AddPlatilloViewModel()
        {
            Tipo = Tipos[0];
        }
        public AddPlatilloViewModel(oBaseDatos operaciones)
        {
            _operaciones = operaciones;
            Tipo = Tipos[0];
        }

        [RelayCommand]
        private async Task<FileResult> GetImage()
        {
            var result = await FilePicker.Default.PickAsync(new PickOptions
            {
                PickerTitle = "Seleccina una imagen"
            });
            if(result!=null)
            {
                if(result.FileName.EndsWith("jpg", StringComparison.OrdinalIgnoreCase)||
                    result.FileName.EndsWith("jpeg", StringComparison.OrdinalIgnoreCase) ||
                    result.FileName.EndsWith("png", StringComparison.OrdinalIgnoreCase)) 
                { 
                    using (Stream stream = await result.OpenReadAsync())
                    {
                        using (MemoryStream ms = new MemoryStream())
                        {
                            await stream.CopyToAsync(ms);
                            ImageData = ms.ToArray();
                        }
                    }
                    return result;
                }
            }
            return null;
        }

        [RelayCommand]
        private async Task Save()
        {
            try
            {
                WeakReferenceMessenger.Default.Send<UnfocusMessage>();
                if(!string.IsNullOrEmpty(Tipo) && !string.IsNullOrEmpty(Nombre) && !string.IsNullOrEmpty(Descripcion)
                    && Precio > 0)
                {
                    var platillo = new PlatillosAttributes
                    {
                        Imagen = this.ImageData,
                        Nombre = this.Nombre,
                        Descripcion = this.Descripcion,
                        Precio = this.Precio,
                        Tipo = this.Tipo,
                        Negocio = App.dSesion.Negocio
                    };

                    var result = _operaciones.GuardarPlatillo(platillo);
                    if(result.Item1)
                    {
                        Title = "Información";
                        Message = result.Item2;
                        IsOpen = true;
                        ResetInterface();
                    }
                }
            }
            catch(Exception ex)
            {
                Title = "Error";
                Message = ex.Message;
                IsOpen = true;
            }
        }

        [RelayCommand]
        private async Task Accept()
        {
            IsOpen = false;
            await Task.Delay(200);
        }


        [RelayCommand]
        private async Task CancelAdvert()
        {
            Title = "Advertencia";
            Message = "Los datos ingresados se perderan";
            IsOpenCancel = true;
            await Task.Delay(1);
        }

        [RelayCommand]
        private async Task AcceptCancel()
        {
            IsOpenCancel = false;
            await Task.Delay(200);
            ResetInterface();
            WeakReferenceMessenger.Default.Send<UnfocusMessage>();
        }

        [RelayCommand]
        private async Task DeclineCancel()
        {
            IsOpenCancel = false;
            await Task.Delay(200);
        }

        private void ResetInterface()
        {
            ImageData = null;
            Nombre = string.Empty;
            Descripcion = string.Empty;
            Precio = 0;
            Tipo = Tipos[0];
        }
    }
}
