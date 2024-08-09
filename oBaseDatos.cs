using MongoDB.Bson;
using MongoDB.Driver;
using Negocios.Models;


namespace Negocios
{
    public class oBaseDatos
    {
        private static MongoClient client = new MongoClient("mongodb://192.168.1.3:27017/");
        private static IMongoDatabase database = client.GetDatabase("Restaurantes");
        private static IMongoCollection<BsonDocument> productsCollection = database.GetCollection<BsonDocument>("Platillos");
        private static IMongoCollection<BsonDocument> negociosCollection = database.GetCollection<BsonDocument>("Negocios");

        public (bool, string) GuardarPlatillo(PlatillosAttributes product)
        {
            bool Success;
            string Message;
            try
            {
                var platillo = new BsonDocument
                {
                    {"imagen", product.Imagen},
                    {"nombre",product.Nombre},
                    {"descripcion",product.Descripcion},
                    {"precio",product.Precio},
                    {"tipo",product.Tipo},
                    {"negocio",product.Negocio}
                };
                productsCollection.InsertOne(platillo);
                Success = true;
                Message = "Platillo guardado exitosamente.";
            }
            catch (Exception ex)
            {
                Message = ex.Message;
                Success = false;
            }
            return (Success, Message);
        }

        public async Task<List<PlatillosAttributes>> ConsultarPlatillos(string negocio)
        {
            List<PlatillosAttributes> result = new List<PlatillosAttributes>();
            var filter = Builders<BsonDocument>.Filter.Eq("negocio", negocio);
            try
            {
                var products = await productsCollection.Find(filter).ToListAsync();
                if(products != null)
                {
                    foreach(var product in products)
                    {
                        var item = new PlatillosAttributes()
                        {
                            Id = product.GetValue("_id").AsObjectId.ToString(),
                            Imagen = product.GetValue("imagen").AsByteArray,
                            Nombre = product.GetValue("nombre").AsString,
                            Descripcion = product.GetValue("descripcion").AsString,
                            Precio = product.GetValue("precio").AsDouble,
                            Tipo = product.GetValue("tipo").AsString,
                            Negocio = product.GetValue("negocio").AsString
                        };
                        result.Add(item);
                    }
                }
            }
            catch (Exception ex)
            {
                string Msg = ex.Message;
            }
            return result;
        }

        public async Task<(bool, string)> UpdateProduct(PlatillosAttributes product)
        {
            bool Success;
            string Message;
            try
            {
                var filter = Builders<BsonDocument>.Filter.Eq("_id", ObjectId.Parse(product.Id)) &
                    Builders<BsonDocument>.Filter.Eq("negocio",product.Negocio);
                var update = new BsonDocument
                {
                    { 
                     "$set", new BsonDocument
                    {
                    {"imagen", product.Imagen},
                    {"nombre",product.Nombre},
                    {"descripcion",product.Descripcion},
                    {"precio",product.Precio},
                    {"tipo",product.Tipo},
                    {"negocio",product.Negocio}
                     }
                    }
                };
                productsCollection.UpdateOne(filter,update);
                Success = true;
                Message = "Datos actualizados correctamente";
            }
            catch(Exception ex)
            {
                Success = false;
                Message = ex.Message;
            }
            await Task.Delay(1);
            return (Success, Message);
        }

        public async Task<(bool, string)> DeleteProduct(PlatillosAttributes product)
        {
            bool Success;
            string Message;
            try
            {
                var filter = Builders<BsonDocument>.Filter.And(
                    Builders <BsonDocument>.Filter.Eq("_id", ObjectId.Parse(product.Id)),
                    Builders <BsonDocument>.Filter.Eq("negocio",product.Negocio)
                    );
                productsCollection.DeleteOne(filter);
                Success = true;
                Message = "Producto eliminado";
            }
            catch (Exception ex)
            {
                Success = false;
                Message = ex.Message;
            }
            await Task.Delay(1);
            return (Success, Message);
        }
        
        public (bool, string, string) ConsultarUsuarioNegocio(string sUser, string sPassword)
        {
            bool Success = false;
            string Message="";
            string Negocio="";
            try
            {
                var filter = Builders<BsonDocument>.Filter.And(
                    Builders<BsonDocument>.Filter.Eq("usuario",sUser),
                    Builders<BsonDocument>.Filter.Eq("contrasena",sPassword)
                    );

                var count = negociosCollection.CountDocuments(filter);

                if(count>0)
                {
                    var usuario = negociosCollection.Find(filter).FirstOrDefault();
                    Negocio = usuario.GetValue("negocio").AsString;
                    Success = true;
                    Message = "";
                }
            }
            catch(Exception ex)
            {
                Success = false;
                Message = ex.Message;
                Negocio = "";
            }
            return (Success, Message, Negocio);
        }

        public (bool,string) RegistrarNegocio(NegocioAttributes DatosNegocio)
        {
            bool Success;
            string Message;
            try
            {
                var documentNegocio = new BsonDocument
                {
                    {"imagen",DatosNegocio.ImagenByte },
                    {"usuario", DatosNegocio.Usuario },
                    {"contrasena",DatosNegocio.Contrasena },
                    {"negocio", DatosNegocio.Negocio },
                    {"telefono", DatosNegocio.Telefono },
                    {"owner", DatosNegocio.Owner },
                    {"direccion", DatosNegocio.Direccion }
                };

                negociosCollection.InsertOne(documentNegocio);
                Success = true;
                Message = "Negocio registrado, ahora puedes iniciar sesión";
            }
            catch (Exception ex)
            {
                Success = false;
                Message = ex.Message;
            }
            return (Success, Message);
        }
    }
}
