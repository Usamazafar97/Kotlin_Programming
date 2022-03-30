/*
* Created by usamazafar at 03/03/2022.
*/

// Parent class
// Open keyword is used to make in inheritable
open class Vehicle(val make: String, val model: String) {

    open fun horn(){
        println("Boom Boom")
    }

}

// Derived class
class Car( make: String, model: String, val color: String): Vehicle(make, model) {

    // overridden function
    override fun horn(){
        super.horn()
        println("Ghom Ghom")
    }

}

fun main() {

    // Car object , that passes the 2 parameters to Vehicle class
    val c1 = Car("1998", "Suzuki", "white")
    print(c1.horn())


}