package com.stefany.platzy
import java.lang.NullPointerException


const val y = 2 // vairblae anchanged globales , pueden usadas en toda la app
//funciones puras
//los valores son cambiantes

fun main(){

    //tipos de variables const, val y var
    val w=2// varible unchanged
    var x=3// variable changed .. es una mala practicerlas como goblales
    val name: String = "Estefany \\n Liza"
    val nameape: String = "Estefany \\n Persona"
    val parrafo:String = """Lorem bshfgsdhgfdhfdjsfg hdgjdfhg dsghdfjghfdjg
        fdhgfdjgkdfghjfdgh **** """
    val edad: Int= 13;
    println(w)
    println(x)
    print(parrafo.trimMargin("****")) //quita los carecteres que ensucian el parrafo
    print("minimbre es : $name $edad")


    //Operador rango: permite imprimir una secuencia de datos
    val oneToHundred = 1..100 //coleccion de elementos del 1 al 100
    for (i in  oneToHundred){ //recorre el arreglo
        println(i)
    }
    val aToC ='A'..'C'//areglo de datos string
    for (letra in 'A'..'C'){
        println(letra)
    }

    //sentencias de control: if , whem, white,do while
    val numero =2
    if(numero.equals(2)){
        println("si son igaules")
    }else{
        println("no son iguales")
    }

    when(numero){
        in 1..5-> println("si esta entre 1 y 5")
        in 1..3-> println("si esta en tre 1 y 3")
        !in 5..10 ->("no esta ebtre 1 y 10")
        else -> println("no esta entre alguno de los anteriores")
    }

    var i=1 //contador
    //while usa contadores
    while (i<=10){
        println(i)
        i++
    }

    do {
        println(i)
    }while (i<=10)

    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")

    for(day in daysOfWeek){
        println(day)
    }
    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }
    daysOfWeek.forEach{
        println(it)
    }

    // en los for estan los breack y el contrinue
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }
    }

    //uso del label con break y continue

    //label y break: el ciclo se retmina al encontrar break
    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }

    //label y continue: l ciclo se corta al econtrar continue y conmiezo con el primero
    escaparJ@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@escaparJ
                println("k: $k")
            }
        }
    }
    //kotlin : null safety --> ningun valor puede ser nulo
    // seguro: para evitar vulnerabilidades en las apalicaciones
    // consico: orque tiene pocos lineas de codigo

    //Double bang
    val variable:Int?
    /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("Ingresa un valor, no aceptamos nulos")
    }*/

    //llamada de forma segura
    var compute : String? = null
    var longitud : Int? = compute?.length
    println("Longitud $longitud")

    //Operador Elvis
    var teclado : String? = null
    val longitudTeclado: Int = teclado?.length?:0
    println("longitud teclado : $longitudTeclado")

    //?Int? admite valores nulos
    val listawithnull : List<Int?> = listOf(7, null, null, 4)
    println("Lista de null ${listawithnull}")
    //limpiar la lista de los valores nulos
    val listawithoutnull : List<Int?> = listawithnull.filterNotNull()
    println(listawithoutnull)

    //Array
    val countries
            = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")

    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")

    var arrayObject = arrayOf(1,2,3)

    var intPrimitive : IntArray = arrayObject.toIntArray()

    val suma = arrayObject.sum()
    println("La suma del array es: $suma")
    arrayObject = arrayObject.plus(4)
    for (a in arrayObject){
        println("Array: $a" )
    }

    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject){
        println("Array reversa: $a")
    }

    arrayObject.reverse()
    for (a in arrayObject){
        println("Array reversa: $a")
    }

    //var x = 5
    println("X es igual a 5? ${x==5}")//true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")
    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")
    val numbers = intArrayOf(6,6,23,9,2,3,2)
    println("El promedio de los números es: ${averageNumbers(numbers,2)}")
    println("${evaluate(6)}")

    //Lambdas
    val saludo = {println("Hola mundo")}
    saludo()

    //var suma = { instrucciones -> sentencias}
    val plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)
    println(plus(1,2,3))
    println({a: Int, b: Int, c: Int -> a+b+c}(7,8,9))

    val calculateNumber = { n: Int ->
        when(n){
            in 1..3 -> println("Tu número está entre 1 y 3")
            in 4..7 -> println("Tu número está entre 4 y 7")
            in 8..10 -> println("Tu número está entre 8 y 10")
        }
    }
    println(calculateNumber(6))

}


//funciones
fun evaluate( number: Int = 2, character: Char = '='): String {
    return "${number} es ${character}"
}

fun averageNumbers(numbers: IntArray, n: Int): Int {
    //Promedio de los numeros

    var sum = 0
    for (num in numbers){
        sum += num
    }

    return (sum / numbers.size)+n
}

