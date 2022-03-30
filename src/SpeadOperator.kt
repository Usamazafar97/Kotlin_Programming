/*
* Created by usamazafar at 08/03/2022.
*/

/*Spread operator is used while Vararg and you want to send the array as vararg*/

fun main() {

    // array containing country names
    val countries = arrayOf("pak","ind","china","ban")

    // sending the array as vararg
    printCountriesUsingSpreadOperator(*countries, totalCountries = 4)
}

// This function will take the countries vararg as array
fun printCountriesUsingSpreadOperator(vararg countries: String, totalCountries: Int){
    println("Total countries: $totalCountries")

    // looping through the countries
    for (country in countries)
        println(country)
}