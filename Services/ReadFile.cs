using Negocios.Models;
using System.Text.Json;

namespace Negocios.Services
{
    public static class ReadFile
    {
        public static async Task<string> GetKey()
        {
            using var stream = await FileSystem.OpenAppPackageFileAsync("key.txt");
            using var reader = new StreamReader(stream);
            var content = reader.ReadToEnd();
            return content;
        }
    }
}
