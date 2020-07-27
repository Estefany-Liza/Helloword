package reto3.model

abstract class Ingrediente(var id: Int, var nombre:String, var descripcion : String) {

    override fun toString(): String {
        return "\n ID : $id  \n Nombre : $nombre  \n Descripcion : $descripcion"
    }

}