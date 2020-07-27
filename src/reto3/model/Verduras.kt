package reto3.model

class Verduras(id: Int, nombre: String, descripcion: String , var cantidad : Int):
        Ingrediente(id, nombre, descripcion), ICrudA {

    var listVerduras : ArrayList<Verduras>? = null

    open fun AñadirFruta(lista : ArrayList<Verduras>, elemento : Verduras): ArrayList<Verduras> {
        listVerduras?.add(elemento)
        return lista
    }

    fun MostrarVerduras() : ArrayList<Verduras>? {
        listVerduras?.forEach {
            println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
        }
        return listVerduras
    }

    fun ObtenerVerduraorId( id: Int) {
        listVerduras?.get(id)
    }

    fun RemoverVerduraforID(id : Int) {
        listVerduras?.removeAt(id)
    }


    //metodos de la interface
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

    override fun toString(): String {
        return super<Ingrediente>.toString() +"Aceite \nMarca: $color \nCantidad: $cantidad"
    }

    var color : String? = null


}