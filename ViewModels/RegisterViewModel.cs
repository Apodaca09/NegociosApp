using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Negocios.Models;
using Negocios.Services;
using System.Collections.ObjectModel;
using System.Text.Json;

namespace Negocios.ViewModels
{
    public partial class RegisterViewModel : NegocioAttributes
    {
        [ObservableProperty]
        private string title = string.Empty;
        [ObservableProperty]
        private string message = string.Empty;
        [ObservableProperty]
        public bool isOpen = false;
        [ObservableProperty]
        private bool isOpenSuccess = false;

        [ObservableProperty]
        private string lada;

        private INavigationService _navigationService;
        private oBaseDatos _operaciones;

        public ObservableCollection<Country> CountriesCodes { get; } = new();
        public RegisterViewModel(INavigationService navigationService, oBaseDatos operaciones)
        {
            _navigationService = navigationService;
            _operaciones = operaciones;
            FillCountries();
        }


        private async void FillCountries()
        {
            try
            {
                using var stream = await FileSystem.OpenAppPackageFileAsync("CountryCodes.json");
                using var reader = new StreamReader(stream);
                var content = await reader.ReadToEndAsync();
                var countries = JsonSerializer.Deserialize<List<Country>>(content);
                
                if(countries != null)
                {
                    if (CountriesCodes.Any())
                        CountriesCodes.Clear();

                    foreach (var item in countries)
                    {
                        CountriesCodes.Add(item);
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
        private async Task AcceptSuccess()
        {
            IsOpenSuccess = false;
            await Task.Delay(200);
            await _navigationService.NavigateBackAsync();
        }

        [RelayCommand]
        public async Task GoToBack()
        {
            Title = "Advertencia";
            Message = "Los datos actuales se perderan";
            IsOpen = true;
            await Task.Delay(1);
        }

        [RelayCommand]
        public async Task GoToBackDecline()
        {
            IsOpen = false;
            await Task.Delay(1);
        }

        [RelayCommand]
        public async Task GoToBackAccept()
        {
            await Task.Delay(200);
            await _navigationService.NavigateBackAsync();
        }

        [RelayCommand]
        public async Task Register()
        { 
            if (ImagenByte != null && Usuario!="" && Contrasena!="" && Negocio!="" && Telefono!=""
                && Owner!="" && Direccion!="" && Lada!="")
            {
                string CodeWithFlag = Lada;
                string Code = CodeWithFlag.Substring(CodeWithFlag.IndexOf('+'));
                var Store = new NegocioAttributes()
                {
                    ImagenByte = ImagenByte,
                    Usuario = Usuario,
                    Contrasena = Contrasena,
                    Negocio = Negocio,
                    Telefono = Code + " " + Telefono,
                    Owner = Owner,
                    Direccion = Direccion
                };

                var result = _operaciones.RegistrarNegocio(Store);
                if(result.Item1)
                {
                    Title = "Información";
                    Message = result.Item2;
                    IsOpenSuccess = true;
                }
            }
        }



        [RelayCommand]
        private async Task<FileResult> GetImage()
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
                            ImagenByte = ms.ToArray();
                        }
                    }
                    return result;
                }
            }
            return null;
        }
    }
}
