using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MongoDB.Bson.Serialization.Attributes;

namespace Negocios.Models
{
    public class NegocioInfo : NegocioAttributes
    {

        public NegocioInfo(string id, byte[] imagen, string user, string pass,
            string negocio, string telefono, string owner, string direccion)
        {
            Id = id;
            ImagenByte = imagen;
            Usuario = user;
            Contrasena = pass;
            Negocio = negocio;
            Telefono = telefono;
            Owner = owner;
            Direccion = direccion;
        }
    }
}
