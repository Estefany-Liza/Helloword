import model.Camera
import model.Movie
import model.Shoe

fun main(args: Array<String>) {
 val camera = Camera()
    camera.turnOff()
    println("La camara esta prendida : ${camera.getCameraStatus()}")

    var shoe = Shoe("sapato","11",111,"ss") //constructor primario

    shoe.size = 37
    println(shoe.size)

    shoe.model = "Zapatos de Tacón"
    println(shoe.model)


    val movie = Movie("Coco", "Pixar", 120)
    println("MOVIE")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} min.")



}