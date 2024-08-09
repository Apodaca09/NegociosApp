using Negocios.Services;
using Negocios.Views;

namespace Negocios
{
    public partial class App : Application
    {
        public static DatosSesion dSesion { get; } = new DatosSesion();
        public static IServiceProvider appServiceProvider { get; set; }
        public App(IServiceProvider serviceProvider)
        {
            string key = ReadFile.GetKey().Result;
            Syncfusion.Licensing.SyncfusionLicenseProvider.RegisterLicense(key);
            InitializeComponent();
            appServiceProvider = serviceProvider;
            MainPage = appServiceProvider.GetRequiredService<AppShell>();
        }

        public static async Task BackToShell()
        {
            Application.Current.MainPage = appServiceProvider.GetRequiredService<AppShell>();
            await Task.Delay(1);
        }

        public static async Task OnLoginSuccessfull()
        {
            Application.Current.MainPage = appServiceProvider.GetRequiredService<FlyoutPageT>() as FlyoutPage;
            await Task.Delay(1);
        }
    }
}
