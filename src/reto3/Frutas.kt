package reto3

class Frutas(id: Int, nombre: String, descripcion: String , var cantidad : Int):
        Ingrediente(id, nombre, descripcion) ,ICrudA{

    var listFrutas : ArrayList<Frutas>? = null

    fun AñadirFruta(lista : ArrayList<Frutas>, elemento : Frutas): ArrayList<Frutas> {
        listFrutas?.add(elemento)
        return lista
    }

    fun  ObtenerFrutas(){
       listFrutas?.forEach {
           println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
       }
    }

    fun ObtenerFrutaforId( id: Int) {
        listFrutas?.get(id)
    }

    fun RemoverFruta(id : Int) {
        listFrutas?.removeAt(id)
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



    override fun toString(): String {
        return super<Ingrediente>.toString() + "Aceite \nColor: $color \nCantidad: $cantidad"
    }
    var color : String? = null


}
