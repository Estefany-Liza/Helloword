package reto3

class Granos(id: Int, nombre: String, descripcion: String, var cantidad: Int) :
        Ingrediente(id, nombre, descripcion), ICrudA {

    var  listaGranos : ArrayList<Granos>? = null


    fun AñadirLacteo(lista : ArrayList<Granos>, elemento : Granos): ArrayList<Granos> {
        listaGranos?.add(elemento)
        return lista
    }

    fun MostrarLacteo() : ArrayList<Granos>? {
        listaGranos?.forEach {
            println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
        }
        return listaGranos
    }

    fun ObtenerGranos( id: Int) {
        listaGranos?.get(id)
    }

    fun RemoverGranosforID(id : Int) {
        listaGranos?.removeAt(id)
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