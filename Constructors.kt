//fun main(args: Array<String>) {
//
//    val person1 = Person("Joe", 25)
//
//    println("First Name = ${person1.firstName}")
//    println("Age = ${person1.age}")
//}
//
//class Person(val firstName: String, var age: Int) {
//
//}
//Primary Constructor and Initializer Blocks
//fun main(args: Array<String>) {
//    val person1 = Person("joe", 25)
//}
//
//class Person(fName: String, personAge: Int) {
//    val firstName: String
//    var age: Int
//
//    // initializer block
//    init {
//        firstName = fName.capitalize()
//        age = personAge
//
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//}

//fun main(args: Array<String>) {
//    val person1 = Person("joe", 25)
//}
//
//class Person(fName: String, personAge: Int) {
//    val firstName = fName.capitalize()
//    var age = personAge
//
//    // initializer block
//    init {
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//}

//Default Value in Primary Constructor
//fun main(args: Array<String>) {
//
//    println("person1 is instantiated")
//    val person1 = Person("joe", 25)
//
//    println("person2 is instantiated")
//    val person2 = Person("Jack")
//
//    println("person3 is instantiated")
//    val person3 = Person()
//}
//
//class Person(_firstName: String = "UNKNOWN", _age: Int = 0) {
//    val firstName = _firstName.capitalize()
//    var age = _age
//
//    // initializer block
//    init {
//        println("First Name = $firstName")
//        println("Age = $age\n")
//    }
//}

//Secondary Constructor
fun main(args: Array<String>) {

    val p1 = AuthLog("Bad Password")
}

open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}