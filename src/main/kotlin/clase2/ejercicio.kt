package clase2

import java.util.Scanner

fun main () {
    /**
     * 1. Escribir un bloque de codigo que pregunte si la edad es menor de 25 imprima (estas joven)
     * si no ( ya estas viejo para la fiesta).
     * 2. que es un switch en kotlin.
      */

    // crear un objeto scanner para leer la entrada por consola
    val scanner = Scanner(System.`in`)
    //ingreso de datos = nombre
    println("Ingresa tu nombre:  ")
    //lee la entrada por consola
    val nombre = scanner.nextLine()
    println("ingrese su edad")
    val age = readln()?.toIntOrNull()
    if (age !=null){
        if (age < 25){
            println("estas joven")
        }else {
            println("hola $nombre ya estas viejo para la fiesta")
        }
        } else{
            print("edad invalida")
    }



}
