import kotlin.reflect.KClass
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.functions
import kotlin.reflect.full.instanceParameter

/*
* Created by usamazafar at 25/03/2022.
*/

class PersonForReflection(val name: String, val age: Int){
    fun print(){}
}

// KProperty
val x: Int = 24

fun printName(name: String){
    println(name)
}

fun main() {



    // original string declaration
    val name = "Usama"

    val person = PersonForReflection("Usama",24)



    // Reflection
    val reflectedString = name::class
    val reflectedPerson = Person::class.typeParameters

    println("hallo")

    person::class.typeParameters.forEach {
        println("Parameters" + it.name)
    }

    // Reference obtained using object
//    println("This is a bounded class reference ${PersonForReflection::class}")


    // finding the global variable
    val property = ::x
    println(property.get())

    // finding the global fuctions
    val function = ::printName
    function.invoke("usama")

    // finding thr class functions
    println(person::class.functions.find { it.name == "print" })

}