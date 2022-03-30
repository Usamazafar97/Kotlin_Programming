fun main() {

    // mutable list of countries
    var countries = listOf("pak", "ind", "ban", "china")

    // immutable list of players
    var players = arrayOf("messi", "ronaldo")


    // encase if the countries list is empty
    if (countries.isEmpty())
        print("list is empty")
    else {

        // concatenation the two lists
        var newList = countries + players

        // printing the list
        print(newList)
    }


    // "contains" method search the keyword in the list of players
    print(
        if (players.contains("lewandowski")) {
            "yesssss"
        } else {
            "not in the list"
        }
    )

    // names are the mutable list of student
    var names = arrayListOf("usama","burhan","talha")

    // new student is added on the 3rd index
    names.add(3,"salman")

    // printing the list
    print(names)

    // practice of the print statement, slash practice
    slashPractice()


    // udemy exercise for printing the bunny
    drawBunny()


    // string and string template
    stringMethods()

}

fun stringMethods() {

    var name = "usama"

    // change the string to capital
    println(name.capitalize())

    var capitalName = "USAMA"

    //change the string to decapitalize
    println(capitalName.decapitalize())


    var lineToTrim = "   Trim this line     "

    // trim the string that removes the spaces
    println( lineToTrim.trim())

    // concatenate the string to the previous string
    println(name.plus("Zafar"))

    val catName = "My cat’s name is \"Fluffy\""

    // printing the cat size
    println(catName.length)


    var myCar = "My car won’t start"

    // extracting the substring with subSequence method
    // 3 is the starting index
    // 6 is the ending index
    println(myCar.subSequence(3,6))

}


// printing the bunny, udemy exercise

fun drawBunny() {

    println("*************Drawing Bunny*************")

    println("(\\(\\")
    println("(-.-)")
    println("o_(\")(\")")

}

fun slashPractice() {

    // if to put " you have to put \, also in case of printing the /
    print("the answer is \"Yes\" so that you can correct yourself")
    println("Two type of slashes: \\ and /")
    println("https://www.google.com")

}
