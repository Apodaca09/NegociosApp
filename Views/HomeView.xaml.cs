using Negocios.ViewModels;

namespace Negocios.Views;

public partial class HomeView : ContentPage
{
    public HomeView()
    {
        InitializeComponent();
    }
    public HomeView(HomeViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
	}
}