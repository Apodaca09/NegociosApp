using CommunityToolkit.Mvvm.Messaging;
using Negocios.ViewModels;
using Negocios.Models;

namespace Negocios.Views;

public partial class AddPlatilloView : ContentPage
{
	public AddPlatilloView()
	{
		InitializeComponent();
	}
    public AddPlatilloView(AddPlatilloViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
		WeakReferenceMessenger.Default.Register<UnfocusMessage>(this, (r,m) =>
		{
			if(m.Message == "Unfocus")
			{
				BtnImagen.Unfocus();
				syncNePrecio.Unfocus();
				EntryDescripcion.Unfocus();
				EntryNombre.Unfocus();
				CmbTipos.Unfocus();
			}
        });
	}
}