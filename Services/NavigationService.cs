using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Negocios.Services
{
    public class NavigationService : INavigationService
    {

        private readonly IServiceProvider _serviceProvider;

        public NavigationService(IServiceProvider serviceProvider)
        {
            _serviceProvider = serviceProvider;
        }
        public async Task NavigateBackAsync()
        {
            await Shell.Current.GoToAsync("..");
        }

        public async Task NavigateToAsync(string route, IDictionary<string, object> routeParameters = null)
        {
            if (routeParameters != null)
            {
                await Shell.Current.GoToAsync(route, routeParameters);
            }
            else
            {
               await Shell.Current.GoToAsync(route);
            }
        }

    }
}
