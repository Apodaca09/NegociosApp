using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Negocios.Services;
using Negocios.Views;

namespace Negocios.ViewModels
{
    public partial class HomeViewModel : ObservableObject
    {
        private readonly INavigationService _navigationService;

        public HomeViewModel(INavigationService navigationService)
        {
            _navigationService = navigationService;
        }

        [RelayCommand]
        public async Task GoToLogin()
        {
            await _navigationService.NavigateToAsync(nameof(LoginView));
        }
        [RelayCommand]
        public async Task GoToRegister()
        {
            await _navigationService.NavigateToAsync(nameof(RegisterView));
        }
    }
}
