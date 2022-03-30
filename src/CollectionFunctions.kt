/*
* Created by usamazafar at 24/03/2022.
*/


fun main() {

    // class to perform functionalities on
    data class Book(val name: String, val author: List<String>)

    //list of persons
    val personsList = listOf(Book("the next 100 years", listOf("usama")), Book("Justin tru do",listOf("usama")))


    // flatmap flatten the array
    val values = personsList.flatMap{
        it.author
    }.toSet()

    println(values)

    // zip -> concatenate the other array with the previous one

    val planets = listOf("Mercury", "Venus", "Mars", "Earth")

    planets.zip(listOf(1,2,3,4))

}