/*
* Created by usamazafar at 22/03/2022.
*/

// interface of containing print function
interface Print{
    fun print()
}

// enum class implementing interface
enum class EnumInheritance: Print{

    // every element overrides the interface method
    WORK{

        // overriding the print method of interface
        override fun print() {
            println("WORK")
        }
    },
    OFFICE{
        override fun print() {
            println("OFFICE")
        }

    }
}


fun main() {

    // object of enum class
    val enum = EnumInheritance.OFFICE

    // calling the print method
    enum.print()
}