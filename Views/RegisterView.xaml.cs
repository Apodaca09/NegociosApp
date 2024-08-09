using Negocios.ViewModels;

namespace Negocios.Views;

public partial class RegisterView : ContentPage
{
	public RegisterView(RegisterViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
	}
}