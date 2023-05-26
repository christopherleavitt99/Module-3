//Kotin if expression
fun main(args: Array<String>) {

    val number = -10

    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }
}

////brackets
//fun main(args: Array<String>) {
//    val number = -10
//    val result = if (number > 0) "Positive number" else "Negative number"
//    println(result)
//}
//
////if block With Multiple Expressions
//fun main(args: Array<String>) {
//
//    val a = -9
//    val b = -11
//
//    val max = if (a > b) {
//        println("$a is larger than $b.")
//        println("max variable holds value of a.")
//        a
//    } else {
//        println("$b is larger than $a.")
//        println("max variable holds value of b.")
//        b
//    }
//    println("max = $max")
//}
//
////if...else..if Ladder
//fun main(args: Array<String>) {
//
//    val number = 0
//
//    val result = if (number > 0)
//        "positive number"
//    else if (number < 0)
//        "negative number"
//    else
//        "zero"
//
//    println("number is $result")
//}
//
////Nested if Expression
//fun main(args: Array<String>) {
//
//    val n1 = 3
//    val n2 = 5
//    val n3 = -2
//
//    val max = if (n1 > n2) {
//        if (n1 > n3)
//            n1
//        else
//            n3
//    } else {
//        if (n2 > n3)
//            n2
//        else
//            n3
//    }
//
//    println("max = $max")
//}
//
