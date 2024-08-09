using Negocios.Models;
using Negocios.ViewModels;
using Negocios.Views;

namespace Negocios;

public partial class FlyoutPageT : FlyoutPage
{
    public FlyoutPageT(MenuViewModel vm)
    {
        InitializeComponent();
        BindingContext = vm;
        Detail = new NavigationPage(App.appServiceProvider.GetService<AddPlatilloView>());
        flyoutPage.collectionView1.SelectionChanged += OnSelectionChanged1;
        flyoutPage.collectionView2.SelectionChanged += OnSelectionChanged2;
        flyoutPage.collectionView3.SelectionChanged += OnSelectionChanged3;
    }

    void OnSelectionChanged3(object? sender, SelectionChangedEventArgs e)
    {
        if (e.CurrentSelection.FirstOrDefault() is FlyoutPageItem item)
        {
            Page page = (Page)ActivatorUtilities.GetServiceOrCreateInstance(App.appServiceProvider, item.TargetType);
            if (page != null)
            {
                Detail = new NavigationPage(page);
                if (!((IFlyoutPageController)this).ShouldShowSplitMode)
                    IsPresented = false;
            }
        }
        flyoutPage.collectionView3.SelectedItem = null;
    }

    void OnSelectionChanged1(object? sender, SelectionChangedEventArgs e)
    {

        if (e.CurrentSelection.FirstOrDefault() is FlyoutPageItem item)
        {

            Page page = (Page)ActivatorUtilities.GetServiceOrCreateInstance(App.appServiceProvider, item.TargetType);
            if (page != null)
            {
                Detail = new NavigationPage(page);
                if (!((IFlyoutPageController)this).ShouldShowSplitMode)
                    IsPresented = false;
            }
        }
        flyoutPage.collectionView1.SelectedItem = null;
    }

    void OnSelectionChanged2(object? sender, SelectionChangedEventArgs e)
    {
        if (e.CurrentSelection.FirstOrDefault() is FlyoutPageItem item)
        {
            Page page = (Page)ActivatorUtilities.GetServiceOrCreateInstance(App.appServiceProvider, item.TargetType);
            if (page != null)
            {
                Detail = new NavigationPage(page);
                if (!((IFlyoutPageController)this).ShouldShowSplitMode)
                    IsPresented = false;
            }
            flyoutPage.collectionView2.SelectedItem = null;
        }
    }
}