using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Negocios.Converters
{
    public class ImageArrayToImageSourceNegociosConverter : IValueConverter
    {
        public object? Convert(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            if (value is byte[] imageData && imageData != null)
            {
                return ImageSource.FromStream(() => new MemoryStream(imageData));
            }
            else
            {
                return "add_logo.png";
            }
        }

        public object? ConvertBack(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            if (value is ImageSource image)
            {
                if (image is StreamImageSource streamImage)
                {
                    using (var stream = streamImage.Stream(CancellationToken.None).Result)
                    {
                        if (stream != null)
                        {
                            using (var memoryStream = new MemoryStream())
                            {
                                stream.CopyTo(memoryStream);
                                return memoryStream.ToArray();
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
