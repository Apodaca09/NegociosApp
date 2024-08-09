using CommunityToolkit.Mvvm.ComponentModel;
using MongoDB.Bson.Serialization.Attributes;

namespace Negocios.Models
{
    public partial class NegocioAttributes : ObservableObject
    {
        [BsonId]
        [BsonRepresentation(MongoDB.Bson.BsonType.ObjectId)]
        [ObservableProperty]
        private string id;
        [BsonElement("imagen")]
        [ObservableProperty]
        private byte[] imagenByte;
        [BsonElement("usuario")]
        [ObservableProperty]
        private string usuario;
        [BsonElement("contrasena")]
        [ObservableProperty]
        private string contrasena;
        [BsonElement("negocio")]
        [ObservableProperty]
        private string negocio;
        [BsonElement("telefono")]
        [ObservableProperty]
        private string telefono;
        [BsonElement("owner")]
        [ObservableProperty]
        private string owner;
        [BsonElement("direccion")]
        [ObservableProperty]
        private string direccion;
    }
}
