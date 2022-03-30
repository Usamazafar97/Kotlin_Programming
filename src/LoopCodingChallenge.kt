/*
* Created by usamazafar at 07/03/2022.
*/

fun main() {

    // Create an array list of your favorite book titles. Loop over this list and, if the title
    // contains the letter ‘e’, print each character of the name on a new line.

    // arraylist
    val bookTitles = arrayListOf("Linear algebra","Calculus-I","Calculus-II","Artificial Intelligence")

    //find e letter
    findLetter('e',bookTitles)

}

// This function will find the character in an arrayList
fun findLetter(character: Char, bookTitles: ArrayList<String>) {
    for (title in bookTitles){
        checkCharacter(title,character)

    }
}

// This function will check if the character is present in the title
fun checkCharacter(title: String, character: Char) {
    if (title.contains(character)){
        printTitle(title)
    }
}

// This function will print the characters of the title on new line
fun printTitle(title: String) {
    for (char in title){
        println(char)
    }
}
