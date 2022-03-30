/*
* Created by usamazafar at 24/03/2022.
*/

// this file will show the implementation of filter and map functions

fun main() {

    //map containing the entries
    val entries = mapOf(Pair(1, PersonForFiltering("usama",12)), Pair(1, PersonForFiltering("anas",12)))

    //list of persons
    val personsList = listOf(PersonForFiltering("usama",24), PersonForFiltering("anas",22))

    // list contain the names of countries
    val countries = listOf("Pakistan", "India", "Sri-lanka", "China", "Bangladesh")


    // filter
    val entryWithKeyEqual1 = entries.filter { it.key == 1 }
    val countriesThatStartWithP = countries.filter { it.startsWith('P') }
    val personsOfAgeGreaterThen20 = personsList.filter { it.age >= 20 }

    println("countriesThatStartWithP: $countriesThatStartWithP")
    println("personsOfAgeGreaterThen20: $personsOfAgeGreaterThen20")
    println("entryWithKeyEqual1: $entryWithKeyEqual1")


    // map
    val countriesFirstThreeLetters = countries.map { it.subSequence(0,3) }
    val countriesFirstThreeLettersAndStartWithP = countries.map { it.subSequence(0,3) }.filter { it.startsWith('P') }

    println("\n\ncountriesFirstThreeLetters: $countriesFirstThreeLetters")
    println("countriesFirstThreeLettersAndStartWithP: $countriesFirstThreeLettersAndStartWithP")



}

data class PersonForFiltering(val name: String , val age: Int)