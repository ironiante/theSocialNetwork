package clase2

/**
 * - constante con usuario de twitch
 * - constante con fecha de nacimiento ( aleatoria)
 * - edad (random)
 * - eres programador?
 * - temperature
 * - en medio de cada declaracion imprime el valor de la constante.
 */
fun main (){
    val name :String
    name="jirman alexander rodriguez"
    println(name)
    val birthDate = "28/10/1980"
    println(birthDate)
    val age = 42
    println(age)
    val isdeveloper=true
    println(isdeveloper)
    val temperature = 26.5
    println(temperature)

    var animal:String

    if (isdeveloper){
        println("you will be a fucking millionaire")
        println("1")
        println("2")
        animal = "dog"
        println(animal)
           } else {
        println("you can still learn")
        println("5")
        println("6")
        animal="cat"
        println(animal)
    }
    println(animal)


}

