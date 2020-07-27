package reto3

fun main(args: Array<String>) {
    println("hola mundo")
    recipes()
}

fun recipes(){

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
            "1"-> makeRecipe()
            "2"-> viewRecipe()
            "3"-> print("Cerrar sesion")
        }


    }while (response!="3")

}

fun makeRecipe() {

    val category = arrayOf<String>("1. Agua", "2. leche", "3. carne", "4. verduras", "5. frutas", "6. cereal","7. huevos", "8. aceites")

    for (c in category){
        println(c)
    }

    println("Elige una opcion")
    val responsetwo: String? = readLine()

}


fun viewRecipe() {
    println("Recetas guardadas")
}