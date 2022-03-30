/*
* Created by usamazafar at 07/03/2022.
*/

// interface of Drivable
interface Driveable{
    fun drive()
}

// interface of builder
interface Builder{
    fun build()
}

// class implementing both interfaces
class Object: Driveable, Builder{
    override fun drive() {
        println("driving.....")
    }

    override fun build() {
        println("Building.....")
    }

}

fun main() {

    // if not specified then both interface methods can be called
    val obj = Object()
    obj.drive()
    obj.build()

    // if specified
    var obj2: Driveable = Object()
    obj2.drive() // only this method is allowed not build()
}