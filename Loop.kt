fun main(args: Array<String>) {

    for (i in 1..5) {
        println(i)
    }

//If the body of the loop contains only one statement
// (like above example), it's not necessary to use
// curly braces
    for (i in 1..5) println(i)
//Different Ways to Iterate Through a Range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

    //Iterating Through an Array
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in language)
        println(item)

    //It's possible to iterate through an array with
    // an index. For example,
    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }

    //Iterating Through a String
    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }

//Similar like arrays, you can iterate through a String
// with an index. For example,

    for (item in text.indices) {
        println(text[item])
    }

}

