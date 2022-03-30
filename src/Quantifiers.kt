/*
* Created by usamazafar at 24/03/2022.
*/

// this file shows the implementation of Quantifies = all, any, count, find and contains

fun main() {

    // class to perform functionalities on
    data class Person(val name: String , val age: Int)

    //list of persons
    val personsList = listOf(Person("usama",24), Person("anas",22))

    // lambda function
    val evaluate = { p:Person -> p.age >= 20}

    // all -> checks that if all the elements satisfy this condition
    println( personsList.all(evaluate))


    // any -> checks that if any the elements satisfy this condition
    println( personsList.any(evaluate))


    // count -> checks how many elements satisfy this condition
    println( personsList.count(evaluate))


    // find  -> to find which element satisfy this condition, returns first element only, return null if it doesn't contain
    println( personsList.find(evaluate))


    // contain  -> checks if the element is present or not
    println( personsList.contains(Person("usama",24)))

    // in  -> checks if the element is present or not
    println( Person("usama",24) in personsList)
}