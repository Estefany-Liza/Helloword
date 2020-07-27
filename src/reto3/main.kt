package reto3

fun main(args: Array<String>) {
    println("hola mundo")
    recipest()
}

fun recipest(){

    println("Bienvenido a recype market")
    do{
        println(".................................")
        val opcion = ("""Selecciones una opcion
                1. Hacer una receta
                2. Revisar mis receta
                3. Cerrar""") .trimIndent()
        println(opcion)
        var response: String? = readLine()

        when(response){
            "1"-> makeRecipet()
            "2"-> viewRecipet()
            "3"-> print("Cerrar sesion")
        }


    }while (response!="3")

}

fun makeRecipet() {
    do {
        /*println(".................................")
        val categoria = ("""Selecciones una Categoriaa
                1. Agua
                2. Leche
                3. Carne
                4. Verduras
                5. Frutas
                6. Cereal
                7. Huevos
                8. Aceites
                9. Salir""") .trimIndent()
        println(categoria)*/
        val category = arrayOf<String>("" +
                "1. Agua",
                "2. leche",
                "3. carne",
                "4. verduras",
                "5. frutas",
                "6. cereal",
                "7. huevos",
                "8. aceites",
                "9. Salir")

        for (c in category){
            println(c)
        }
        var rescategoria: String? = readLine()
        when(rescategoria){
            "1" -> {
                println("-------Agua---------")
                println("Cantidad de Agua")
                val categoria: String? = readLine()
            }

            "2" -> {
                println("------Lacteos-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Lacteos(id.toInt(),name!! ,descripcion!!, cantidad.toInt())
            }

            "3" -> {
                println("------Carme-------")
                println("IdCarne: ")
                //var idc: Int? = 1
                val idc: String = readLine() ?: "0"
                println("Nombre Carne : ")
                val namec: String? =  readLine()
                println("Descripcion Carne:")
                val descripcionc: String? =  readLine()
                println("Cantidad Kilos : ")
                val cantidad: String = readLine() ?: "0"

                Carnes(idc.toInt(),namec!! ,descripcionc!!, cantidad.toInt())
            }

            "4" -> {
                println("------Verduras-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Verduras(id.toInt(),name!! ,descripcion!!, cantidad.toInt())
            }
            "5" -> {
                println("------Frutas-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Frutas(id.toInt(),name!! ,descripcion!!, cantidad.toInt())
            }
            "6" -> {
                println("------Cereal-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Granos(id.toInt(),name!! ,descripcion!!, cantidad.toInt())
            }
            "7" -> {
                println("------Huevos-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Lacteos(id.toInt(),name!! ,descripcion!!, cantidad.toInt())
            }
            "8" -> {
                println("------Verduras-------")
                println("Id : ")
                val id: String = readLine() ?: "0"
                println("Nombre : ")
                val name: String? =  readLine()
                println("Descripcion :")
                val descripcion: String? =  readLine()
                println("Cantidad : ")
                val cantidad: String = readLine() ?: "0"

                Aceite(cantidad.toInt(), cantidad.toInt(),name!! ,descripcion!!)

            }
            "9"-> println("Gracias por elegirnos")
        }

    }while (rescategoria!="9")




}


fun viewRecipet() {

    return println("Ver ingredientes")

}