/*
* Created by usamazafar at 14/03/2022.
*/

// enum class built wth color and number properties
enum class Colors(val colors: String, val number: Int){
    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3)
}

fun main() {

    // Enums property accessed directly
    println(Colors.BLUE.number)
}