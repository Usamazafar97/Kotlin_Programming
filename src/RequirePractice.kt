/*
* Created by usamazafar at 14/03/2022.
*/

fun main() {

    val name: String = "usama"

    // throws exception as well with the provided string
//    require(name.length > 10) { "String is empty" }
//    println(name)

    assert(name.length < 10) { "String is empty" }
    println(name)
}