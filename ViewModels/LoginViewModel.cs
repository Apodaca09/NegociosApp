using Android.Database;
using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Negocios.Services;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Negocios.ViewModels
{
    public partial class LoginViewModel : ObservableObject
    {
        [ObservableProperty]
        private string title;
        [ObservableProperty]
        private string message;
        [ObservableProperty]
        private bool isOpen;

        private INavigationService _navigationService;
        private oBaseDatos _operaciones;

        [ObservableProperty]
        private string usuario;
        [ObservableProperty]
        private string password;
        public LoginViewModel(INavigationService navigationService,oBaseDatos operaciones)
        {
            _navigationService = navigationService;
            _operaciones = operaciones;
            usuario = "";
            password = "";
        }

        [RelayCommand]
        private async Task AcceptSuccess()
        {
            await Task.Delay(200);
            IsOpen = false;
        }
        

        [RelayCommand]
        public async Task GoToBack()
        {
           await _navigationService.NavigateBackAsync();
        }

        [RelayCommand]
        public async Task LoginIntent()
        {
            if(Usuario != "" && Password != "")
            {
                var result = _operaciones.ConsultarUsuarioNegocio(Usuario, Password);
                if(result.Item1)
                {
                    App.dSesion.Negocio = result.Item3;
                    await App.OnLoginSuccessfull();
                }
                else
                {
                    Title = "Error";
                    Message = result.Item2;
                    IsOpen = true;
                }
            }
            else
            {
                Title = "Información";
                Message = "Algunos datos no fueron completados";
                IsOpen = true;
            }
        }
    }
}
