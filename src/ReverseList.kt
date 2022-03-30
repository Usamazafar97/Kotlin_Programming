import java.lang.Exception

/*
* Created by usamazafar at 07/03/2022.
*/

fun main() {
     var  array: ArrayList<String> = ArrayList()
    // reverse the given list
    val numbers = listOf(1,2,3,6,8,9)
    //reverse the list
    println("Reversed List: ${reverseList(numbers)}")

    // check the list, if item is 6 change to 10
    checkList(numbers)

    // No change in the original array because clone was made in the function
    print("Original List: ")
    println(array.size)
    println(numbers)


}

fun reverseList(numbers: List<Int>): ArrayList<Int> {

    // new list
    val newList = arrayListOf<Int>()

    // looping through the list to copy to the new list
    for (item in numbers.size - 1 downTo 0){
        newList.add(numbers[item])
    }

    return newList

}

// This function will reverse the list given to it
fun checkList(numbers: List<Int>) {

    // clone of the parameterized list
    val items = numbers.toMutableList()

    // loop through the list
    for (itemNumber in items.indices){

        //check if the item == 6, change to 10
        if (items[itemNumber] == 6){
            items[itemNumber] = 10
        }
    }

    // printing the changed list
    print("Copied List: ")
    println(items)
    checkNothing()

}

fun checkNothing() : Nothing{
    //var error: java.lang.Exception= Exception()
    throw java.lang.Exception()
}


