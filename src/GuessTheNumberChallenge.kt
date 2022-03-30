import java.util.Scanner

/*
* Created by usamazafar at 07/03/2022.
*/

fun main() {

    val arrayList = ArrayList<Any>()

    // generated random number
    val actualNumber = getRandomNumber()

    do {
        // ask user to enter the number
        val enteredNumber = inputNumber()

        // check the guess
        checkUsersGuess(enteredNumber, actualNumber)

    } while (enteredNumber != actualNumber)

}

// This function will check the user entered number and the actual number
fun checkUsersGuess(enteredNumber: Int, actualNumber: Int) {

    when {
        enteredNumber > actualNumber -> printString("Your guessed number is higher then the actual")
        enteredNumber < actualNumber -> printString("Your guessed number is lower then the actual")
        else -> printString("Congratulations, You guessed right")
    }
}


// This function will return the random number
fun getRandomNumber(): Int {

    return (Math.random() * 999 + 1).toInt()
}

// This function will ask the user to enter the number
fun inputNumber(): Int {

    print("Enter a number: ")

    // Scanner for input
    val input = Scanner(System.`in`)

    //return the entered number
    return input.nextInt()

}

fun printString(string: String){
    println(string)

}

