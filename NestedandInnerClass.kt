//Nestedd Class
//class Outer {
//
//    val a = "Outside Nested class."
//
//    class Nested {
//        val b = "Inside Nested class."
//        fun callMe() = "Function call from inside Nested class."
//    }
//}
//
//fun main(args: Array<String>) {
//    // accessing member of Nested class
//    println(Outer.Nested().b)
//
//    // creating object of Nested class
//    val nested = Outer.Nested()
//    println(nested.callMe())
//}

//Inner Class
class Outer {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = Outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")
}

//