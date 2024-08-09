using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Negocios.Models;
using System.Collections.ObjectModel;
using Negocios.Services;
using MongoDB.Bson.Serialization.Attributes;
using CommunityToolkit.Mvvm.Messaging;

namespace Negocios.ViewModels
{
    public partial class PlatillosManagerViewModel : ObservableObject
    {
        [ObservableProperty]
        private string title = string.Empty;
        [ObservableProperty]
        private string message = string.Empty;
        [ObservableProperty]
        private bool isOpenError = false;
        [ObservableProperty]
        private bool isOpen = false;
        [ObservableProperty]
        private bool isOpenConfirm = false;
        [ObservableProperty]
        private bool confirm = false;

        private oBaseDatos _operaciones;

        private PlatillosAttributes _product;

        public PlatillosManagerViewModel(oBaseDatos operaciones)
        {
            _operaciones = operaciones;
            _product = new PlatillosAttributes();
        }
        public ObservableCollection<PlatillosAttributes> Productos { get; } = new();

        [RelayCommand]
        public async Task GetProducts()
        {
            try
            {
                var products = await _operaciones.ConsultarPlatillos(App.dSesion.Negocio);
                if (products != null)
                {
                    if (Productos.Any())
                    {
                        Productos.Clear();
                    }
                    foreach (var item in products)
                        Productos.Add(item);
                }
            }
            catch(Exception ex)
            {
                Title = "Error";
                Message = ex.Message;
                IsOpenError = true;
            }
        }

        [RelayCommand]
        public async Task Update(PlatillosAttributes platillo)
        {
            try
            {
                if (platillo!=null)
                {
                    var result = await _operaciones.UpdateProduct(platillo);
                    if (result.Item1)
                    {
                        Title = "Éxito";
                        Message = result.Item2;
                        IsOpen = true;
                    }
                    else
                    {
                        Title = "Error";
                        Message = result.Item2;
                        IsOpenError = true;
                    }
                }
            }
            catch(Exception ex)
            {
                Title = "Error";
                Message = ex.Message;
                IsOpenError = true;
            }
        }

       [RelayCommand]
       private void Delete(PlatillosAttributes platillo)
        {
            _product = platillo;
            Title = "Eliminar producto";
            Message = "¿Seguro que quieres eliminar este producto?, esta acción no se puede revertir.";
            IsOpenConfirm = true;
        }


        [RelayCommand]
        private async Task DeclineDelete()
        {
            Confirm = false;
            IsOpenConfirm = false;
            await Task.Delay(1);
        }

        [RelayCommand]
        private async Task AcceptDelete()
        {
            Confirm = true;
            try
            {
                if (Confirm)
                {
                    IsOpenConfirm = false;
                    if (_product != null)
                    {
                        var result = await _operaciones.DeleteProduct(_product);
                        if (result.Item1)
                        {
                            Title = "Éxito";
                            Message = result.Item2;
                            IsOpen = true;
                        }
                        await GetProducts();
                    }
                }
            }
            catch (Exception ex)
            {
                Title = "Error";
                Message = ex.Message;
                IsOpenError = true;
            }
        }

        [RelayCommand]
        private async Task<FileResult> GetImage(PlatillosAttributes item)
        {
            var result = await FilePicker.Default.PickAsync(new PickOptions
            {
                PickerTitle = "Seleccina una imagen"
            });
            if (result != null)
            {
                if (result.FileName.EndsWith("jpg", StringComparison.OrdinalIgnoreCase) ||
                    result.FileName.EndsWith("jpeg", StringComparison.OrdinalIgnoreCase) ||
                    result.FileName.EndsWith("png", StringComparison.OrdinalIgnoreCase))
                {
                    using (Stream stream = await result.OpenReadAsync())
                    {
                        using (MemoryStream ms = new MemoryStream())
                        {
                            await stream.CopyToAsync(ms);
                            item.Imagen = ms.ToArray();
                        }
                    }
                    return result;
                }
            }
            return null;
        }

        [RelayCommand]
        private void CloseMessageError()
        {
            IsOpenError = false;
        }

        [RelayCommand]
        private void CloseMessageExito()
        {
            IsOpen = false;
        }
    }
}
