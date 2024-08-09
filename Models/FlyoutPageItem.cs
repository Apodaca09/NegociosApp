using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Negocios.Models
{
    public class FlyoutPageItem
    {
        public string Title  { get; set; }
        public string IconSource { get; set; }
        public Type TargetType { get; set; }
    }
}
