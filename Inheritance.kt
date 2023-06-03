//open class Person(age: Int, name: String) {
//    // some code
//}
//
//class Footballer(age: Int, name: String, club: String): Person(age, name) {
//    init {
//        println("Football player $name of age $age and plays for $club.")
//    }
//
//    fun playFootball() {
//        println("I am playing football.")
//    }
//}
//
//fun main(args: Array<String>) {
//    val f1 = Footballer(29, "Cristiano", "LA Galaxy")
//}

// Empty primary constructor
//open class Person() {
//    open var age: Int = 0
//        get() = field
//
//        set(value) {
//            field = value
//        }
//}
//
//class Girl: Person() {
//
//    override var age: Int = 0
//        get() = field
//
//        set(value) {
//            field = value - 5
//        }
//}
//
//fun main(args: Array<String>) {
//
//    val girl = Girl()
//    girl.age = 31
//    println("My fake age is ${girl.age}.")
//}

//Calling Members of Base Class from Derived Class
open class Person() {
    open fun displayAge(age: Int) {
        println("My actual age is $age.")
    }
}

class Girl: Person() {

    override fun displayAge(age: Int) {

        // calling function of base class
        super.displayAge(age)

        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(31)
}