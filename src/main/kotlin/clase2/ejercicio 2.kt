package clase2

fun main (){
    println("ingrese su nombre: ")
    val nombre = readLine()
    println("ingrese su edad: ")
    val age = readLine()?.toIntOrNull() //El operador Elvis se escribe como "?:", y se utiliza para
// simplificar la escritura de expresiones condicionales // en las que se desea asignar un valor predeterminado
// en caso de que una expresión sea nula.
   if (age != null && age <25 ) {
       println(" $nombre , eres joven")
   }else {
       println("$nombre , ya eres viejo para la fiesta")
   }


}