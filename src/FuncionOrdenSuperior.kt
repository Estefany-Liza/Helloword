// funcion de orden superior
// sirve para reutilizar una funacion

fun main() {
   val resul : Int= calculadora(1,2,3,::multiplicar)
    println("El resultado es $resul")
    println("La multiplicacion es ${calculadora(4,5,7,::restar)}")
    println("La suma es ${calculadora(4,5,7,::sumar)}")
}
// mi funcion(variables, retorno): tipos de rectorno
fun calculadora(a:Int, b:Int, c:Int, operacion: (Int, Int, Int)-> Int): Int{
    return operacion(a,b,c) //generica
}

fun sumar(a:Int, b:Int, c:Int)= a+b+c
fun restar(a:Int, b:Int, c:Int)= a-b-c
fun multiplicar(a:Int, b:Int, c:Int)= a*b*c


//ejemplo clasico es setonclicklistener
// callback-- > cuando se realiza un API


//listas hashMapOf :lista de pares de datos
val months = hashMapOf(
        "Enero" to 1,
        "Febrero" to 2,
        "Marzo" to 3,
        "Abril" to 4,
        "Mayo" to 5,
        "Junio" to 6,
        "Julio" to 7,
        "Agosto" to 8,
        "Septiembre" to 9,
        "Octubre" to 10,
        "Noviembre" to 11,
        "Diciembre" to 12)

//filter es un ejemplo de FUNCIONES DE ORDEN SUPERIOR
//filer filtra datos que cumplan una condicion

val numbersInt = listOf(4,3,2)
    //numbersInt.filter { it % 2 == 0}

val words = listOf("Oasis","Hola", "Holanda", "Objeto")
    //words.filter { it.startsWith('O') }