//fun main(args : Array<String>) {
//    println("Kotlin is interesting.")
//}

//fun main(args : Array<String>) {
//    println("1. println ");
//    println("2. println ");
//
//    print("1. print ");
//    print("2. print");
//}

//fun main(args : Array<String>) {
//    val score = 12.3
//
//    println("score")
//    println("$score")
//    println("score = $score")
//    println("${score + score}")
//    println(12.3)
//}
//
//fun main(args: Array<String>) {
//    print("Enter text: ")
//
//    val stringInput = readLine()!!
//    println("You entered: $stringInput")
//}

import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}