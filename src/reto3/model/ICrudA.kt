package reto3.model

interface ICrudA {
    fun create(): String

    fun read(): String

    fun update(): String

    fun delete(): String

    fun saludar(mensaje: String){
        println("Este es tu mensaje $mensaje")
    }
}