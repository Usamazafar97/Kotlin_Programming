/*
* Created by usamazafar at 03/03/2022.
*/

fun main() {

    // hashmap that contain data of car owners
    val carBelongingsHashMap = hashMapOf(1 to "Usama", 2 to "Anas", 3 to "Abubakkar")

    // print the car owner info
    printData(carBelongingsHashMap)


}

// This function will print the information of car owner
fun printData(carBelongingsHashMap: HashMap<Int, String>) {

    // looping through map and printing the id with their owners
    for ((id,owner) in carBelongingsHashMap){
        println("$id -> $owner")
    }

}
