import java.util.ArrayList

/*
* Created by usamazafar at 17/03/2022.
*/

fun main() {

    // data class person containing the properties
    data class Person(val name: String, val age: Int)

    // array of persons
    val array = arrayListOf<Person>(Person("usama",23), Person("Salman",20))

//    array.sort()

    // sorting on the basis of age
    val sortedList = array.sortedWith(compareBy { it.age })
    print(sortedList)

}

