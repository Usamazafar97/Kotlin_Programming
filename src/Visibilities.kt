/*
* Created by usamazafar at 14/03/2022.
*/

class Visibilities {

    // public -> visible to all
    // private -> no visibility outside the class
    // protected -> only visible to inherited classes
    // internal -> visible in same module


     private var name: String = "Usama"
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val v = Visibilities()
//    v.name -> except private possible
}