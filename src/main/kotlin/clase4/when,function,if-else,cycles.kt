package clase4

fun main (){
    /**
     * day 4
     * - when , function , if else , cycles
     * - program kitchen
     * un igual es asignacion
     * == es comparacion
     * operadores logicos : && unir dos condiones
     *                      condicion && condicion = true  ; and
     *                       true && true ambas deben ser verdaderas.
     * ejemplo: edad=23
     *          nombre= daniel
     *   if (edad ==25 && nombre== daniel){
     *   prinlin ( "hola daniel")
     *   }else { print ( biemvenido)
      */

  println(" welcome to jirman inc")
  println("do you want a milkshake?")
    //un igual (=) es asignacion
  var answer = readLine()
    //dos iguales (==) es comparacion de igual
  if (answer == "yes"){
      println(" what flavors?")
      val flavors= readLine()
      milkshake(flavors!!)
  }
  println("Do you want a sandwich?")
  answer = readLine()
  if (answer == "yes"){
      println("what protein?")
      val protein = readLine()
      if (protein=="proscuitto"){
          println("this sandwich is more expensive, do you want to confirm")
          val confirmation = readLine()

      }
      sandwich(protein!!)
  }
  println(" thanks you for you visit")

}
fun milkshake (fruit:String){  // batido , funcion.
    println("starting a milkshake ")
    println("the milkshake of $fruit is  done")
    println("_________________________")

}
fun sandwich(protein:String){
    println("starting a sandwich ")
    println("the milkshake of $protein is  done")
    println("_________________________" )

}