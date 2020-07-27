package reto3

class Lacteos(id: Int, nombre: String, descripcion: String, var cantidad : Int) :
        Ingrediente(id, nombre, descripcion) , ICrudA{

    var  listaLacteos : ArrayList<Lacteos>? = null


    open fun AñadirLacteo(lista : ArrayList<Lacteos>, elemento : Lacteos): ArrayList<Lacteos> {
        listaLacteos?.add(elemento)
        return lista
    }

    open fun MostrarLacteo() : ArrayList<Lacteos>? {
        listaLacteos?.forEach {
            println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
        }
        return listaLacteos
    }

    fun ObtenerLacteo( id: Int) {
        listaLacteos?.get(id)
    }

    fun RemoverAceiteforID(id : Int) {
        listaLacteos?.removeAt(id)
    }


    override fun create(): String {
        return "Creado con exito"
    }

    override fun read(): String {
        return "leido con exito"
    }

    override fun update(): String {
        return "Actualizaco con exito"
    }

    override fun delete(): String {
        return "eliminado con exito"
    }


}