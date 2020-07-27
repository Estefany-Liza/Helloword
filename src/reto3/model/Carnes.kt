package reto3.model

class Carnes(id: Int, nombre: String, descripcion: String, var cantidad: Int)
    : Ingrediente(id, nombre, descripcion) , ICrudA {

    var listCarnes : ArrayList<Carnes>? = null

    fun AñadirAceite(lista : ArrayList<Carnes>, elemento : Carnes): ArrayList<Carnes> {
        listCarnes?.add(elemento)
        return lista
    }

    fun MostrarCarnes() : ArrayList<Carnes>? {
        listCarnes?.forEach {
            println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
        }
        return listCarnes
    }

    fun ObtenerCarneforId( id: Int) {
        listCarnes?.get(id)
    }

    fun RemoverCarneforID(id : Int) {
        listCarnes?.removeAt(id)
    }

    override fun create(): String {
        TODO("Not yet implemented")
    }

    override fun read(): String {
        TODO("Not yet implemented")
    }

    override fun update(): String {
        TODO("Not yet implemented")
    }

    override fun delete(): String {
        TODO("Not yet implemented")
    }
}