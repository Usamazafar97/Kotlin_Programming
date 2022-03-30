/*
* Created by usamazafar at 08/03/2022.
*/

// This file shows the implementation of infix functions

fun main() {

    // making an object of Calculation Class to implement the infix function
    val cal1 = Calculation(5)
    cal1.sum(6)

    println(cal1.number)

}

// This class contains an infix method named sum
class Calculation(number: Int){

    // data member
    var number: Int = number

    // infix method must take 1 argument
    infix fun sum(number: Int){
        this.number += number
    }
}