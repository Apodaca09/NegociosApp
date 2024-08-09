using Negocios.ViewModels;

namespace Negocios.Views;

public partial class LoginView : ContentPage
{
	public LoginView(LoginViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
	}
}