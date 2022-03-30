/*
* Created by usamazafar at 08/03/2022.
*/

fun main() {

    // array containing country names
    printCountries("pak","ind","china","ban", number = 4)
}

// This function will take the countries vararg
fun printCountries(vararg countries: String, number: Int){
    println("Total countries: $number")

    // looping through the countries
    for (country in countries)
        println(country)
}