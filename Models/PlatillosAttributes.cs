using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CommunityToolkit.Mvvm.ComponentModel;
using MongoDB.Bson.Serialization.Attributes;

namespace Negocios.Models
{
    public partial class PlatillosAttributes : ObservableObject
    {
        [BsonId]
        [BsonRepresentation(MongoDB.Bson.BsonType.ObjectId)]
        [ObservableProperty]
        private string? id;
        [BsonElement("imagen")]
        [ObservableProperty]
        private byte[] imagen;
        [BsonElement("nombre")]
        [ObservableProperty]
        private string nombre;
        [BsonElement("descripcion")]
        [ObservableProperty]
        private string descripcion;
        [BsonElement("precio")]
        [ObservableProperty]
        private double precio;
        [BsonElement("tipo")]
        [ObservableProperty]
        private string tipo;
        [ObservableProperty]
        [BsonElement("negocio")]
        private string negocio;
    }
}
