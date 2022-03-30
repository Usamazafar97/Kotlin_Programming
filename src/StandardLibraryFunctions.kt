/*
* Created by usamazafar at 14/03/2022.
*/

// with -> return the last line
// let -> for null objects
// run -> also returns the last line
// apply -> returns the wholw object
// use -> Exception se bachne k liye
// lazy -> initialize the object one time and use its value

fun main() {

    data class Person(val name: String, val age: Int, val cnic: String)

    /* Run implementation

    val CNIC = Person("Usama",24, "248724897238472").run{
       println(name)
        println(age)
        println(cnic)

        cnic

    }*/

    /* With implementation

    val p1 = Person("Usama",24, "248724897238472")

    val CNIC = with(p1){
       println(name)
        println(age)
        println(cnic)

        cnic

    }*/

    /* apply implementation

    val CNIC = Person("Usama",24, "248724897238472").apply {
        println(name)
        println(age)
        println(cnic)

        cnic
    }*/

    fun getNumber(): Int = getRandomNumber()


    val printingName = lazy { getNumber() }

    println(printingName.value)

//    print(CNIC)

}