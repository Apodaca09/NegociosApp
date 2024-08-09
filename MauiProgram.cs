using Plugin.Firebase.Auth;
using Plugin.Firebase.Bundled.Shared;
using Microsoft.Extensions.Logging;
using Plugin.Firebase.Crashlytics;
using Microsoft.Maui.LifecycleEvents;
using Syncfusion.Maui.Core.Hosting;
using Negocios.Services;
using Negocios.ViewModels;
using Negocios.Views;



#if IOS
using Plugin.Firebase.Bundled.Platforms.iOS;
#else
using Plugin.Firebase.Bundled.Platforms.Android;
#endif

namespace Negocios
{
    public static class MauiProgram
    {
        public static MauiApp CreateMauiApp()
        {
            var builder = MauiApp.CreateBuilder();
            builder
                .UseMauiApp<App>()
                .ConfigureFonts(fonts =>
                {
                    fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
                    fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
                    fonts.AddFont("Lemon-Regular.ttf", "Lemon");
                    fonts.AddFont("Acme-Regular.ttf", "Acme");
                });
            //Registro de clase que trabaja MongoDB
            builder.Services.AddSingleton<oBaseDatos>();
            
            //Registro de services
            builder.Services.AddSingleton<IDialogService, DialogService>();
            builder.Services.AddSingleton<INavigationService, NavigationService>();
            //Registro de viewmodels
            builder.Services.AddTransient<HomeViewModel>();
            builder.Services.AddTransient<AddPlatilloViewModel>();
            builder.Services.AddTransient<PlatillosManagerViewModel>();
            builder.Services.AddTransient<LoginViewModel>();
            builder.Services.AddTransient<RegisterViewModel>();
            builder.Services.AddTransient<MenuViewModel>();
            //Registro de views
            builder.Services.AddTransient<PlatillosManagerView>();
            builder.Services.AddTransient<AddPlatilloView>();
            builder.Services.AddTransient<LoginView>();
            builder.Services.AddTransient<RegisterView>();
            builder.Services.AddTransient<HomeView>();
            builder.Services.AddTransient<FlyoutPageT>();
            builder.Services.AddTransient<AppShell>();
            builder.ConfigureSyncfusionCore();
#if DEBUG
            builder.Logging.AddDebug();
#endif

            var app = builder.Build();
            return app;
        }

        private static MauiAppBuilder RegisterFirebaseServices(this MauiAppBuilder builder)
        {
            builder.ConfigureLifecycleEvents(events =>
            {
#if IOS
            events.AddiOS(iOS => iOS.FinishedLaunching((app, launchOptions) => {
                CrossFirebase.Initialize(CreateCrossFirebaseSettings());
                return false;
            }));
#else
                events.AddAndroid(android => android.OnCreate((activity, _) =>
                    CrossFirebase.Initialize(activity, CreateCrossFirebaseSettings())));
                CrossFirebaseCrashlytics.Current.SetCrashlyticsCollectionEnabled(true);
#endif
            });

            builder.Services.AddSingleton(_ => CrossFirebaseAuth.Current);
            return builder;
        }

        private static CrossFirebaseSettings CreateCrossFirebaseSettings()
        {
            return new CrossFirebaseSettings(isAuthEnabled: true,
            isCloudMessagingEnabled: true, isAnalyticsEnabled: true);
        }
    }
}
