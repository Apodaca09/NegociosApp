using AndroidX.Lifecycle;
using CommunityToolkit.Mvvm.Messaging;
using Java.Lang;
using Microsoft.Maui.Controls.Internals;
using Negocios.Models;
using Negocios.ViewModels;
using Syncfusion.Maui.Inputs;

namespace Negocios.Views;

public partial class PlatillosManagerView : ContentPage
{
	PlatillosManagerViewModel? _vm;
	public PlatillosManagerView()
	{
		InitializeComponent();
	}

	public PlatillosManagerView(PlatillosManagerViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
		this._vm = vm;
    }

    protected override async void OnAppearing()
    {
        base.OnAppearing();
		if(_vm.GetProductsCommand.CanExecute(null))
		{
			await _vm.GetProductsCommand.ExecuteAsync(null);
		}
    }
}