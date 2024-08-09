using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;

namespace Negocios.ViewModels
{
    public partial class MenuViewModel : ObservableObject
    {

        [RelayCommand]
        private static async Task Logout()
        {
            await App.BackToShell();
        }
    }
}
