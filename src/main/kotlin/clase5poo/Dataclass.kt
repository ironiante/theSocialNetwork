package clase5poo

/**
 * En Kotlin, las data classes son clases que se utilizan para representar datos inmutables.
 * Al definir una data class, Kotlin proporciona automáticamente implementaciones de métodos
 * como equals(), hashCode() y toString() basadas en los parámetros definidos en la clase.
 * nos evita todo el boilerplate de los getters y los setters, además del constructor.
 * Una data class no es más que una clase que sólo contiene estado y no realiza ninguna operación.
 */
 //propiedades
 data class phone (
     val width:Float,
     val height:Float,
     val brand:String,
     val model:String,
     val color:String,
     val numberOfcameras:Int,

     var battery:Int,
     var signalsStrength:Int,
              )
{
    //metodos
    fun call(phone:String){
        println("the phone $brand - $model is calling the number $phone")
    }

 }
// vamos a crear objetos 1
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
fun main (){
    val iphone = phone(140F,180F,"Apple","iphone 14 pro max","purple",2,100,100)
    iphone.call("111-111-111")
    println(iphone.color)
// objeto 2
   val samsungS23=phone (
       160F,190F,"Samsung","Samsung Galaxy S23 Ultra","Green",5,70,0
           )

}

