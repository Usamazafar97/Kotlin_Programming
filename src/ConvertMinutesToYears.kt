import java.util.Scanner

/*
* Created by usamazafar at 02/03/2022.
*/

fun main() {

    // variable to store the time in minutes that the user enters
    var timeInMinutes: Double = inputTheMinutes()


    // Convert minutes to years
    var timesInYears: Double = convertToYears(timeInMinutes)


    // This function will print the time in years
    printTimeInYears(timesInYears)


    // Convert minutes to days
    var timesInDays: Double = convertToDays(timeInMinutes)


    // This function will print the time in days
    printTimeInDays(timesInDays)



    // for the triple quote printing
    tripleQuote()


}

fun inputTheMinutes(): Double {

    var inputMinutes: Double

    print("Enter the time in minutes: ")

    // Scanner for input of the minutes
    var input = Scanner(System.`in`)

    //nextDouble is to get the Double input
    inputMinutes = input.nextDouble()

    // returns the minutes
    return inputMinutes
}


// This function will print the time in years
fun printTimeInDays(timesInDays: Double) {
    println("Time in days: ${String.format("%.3f", timesInDays).toDouble()}")
}

// This function will print the time in years
fun printTimeInYears(timesInYears: Double) {
    println("Time in years: ${String.format("%.3f", timesInYears).toDouble()}")
}

// This function print the tripleQuote print statement
fun tripleQuote() {

    // print the same to the console with same spaces
    print(""" For (i in count){
        i += 1
    }
    """)

    // { } parenthesis used for concatenating the variable in quote
    print("""
        ${"$"}99.0
    """.trimMargin())
}


// This function will convert the minutes to years
fun convertToYears(minutes: Double): Double {
    return minutes / (60 * 24 * 365)
}

// This function will convert the minutes to days
fun convertToDays(minutes: Double): Double {
    return ((minutes / 60.0 / 24.0).toInt() % 365).toDouble()
}
