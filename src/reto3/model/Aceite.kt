package reto3.model


class Aceite( var cantidad:Int, id: Int, nombre: String, descripcion: String):
        Ingrediente(id, nombre, descripcion) , ICrudA {

    var listAceite : ArrayList<Aceite>? = null

    fun AñadirAceite(lista : ArrayList<Aceite>, elemento : Aceite): ArrayList<Aceite> {
        listAceite?.add(elemento)
        return lista
    }

    fun MostrarAceite() : ArrayList<Aceite>? {
        listAceite?.forEach {
            println("Lista de Frutas :\n  ID : $id,\n Nombre : $nombre,\n Cantidad $cantidad")
        }
        return listAceite
    }

    fun ObtenerAceiteforId( id: Int) {
        listAceite?.get(id)
    }

    fun RemoverAceiteforID(id : Int) {
        listAceite?.removeAt(id)
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

    //metodo hereado de Ingrediente
    override fun toString(): String {
        return super<Ingrediente>.toString() +"Aceite \nMarca: $marca \nCantidad: $cantidad"
    }

    var marca : String = "Primor"
        set(value) {
            if (value.equals("Doñ Costeño")){
                field = "Primor"
            }
        }
        get() = field

}