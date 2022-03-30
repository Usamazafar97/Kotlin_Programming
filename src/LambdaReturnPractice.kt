/*
* Created by usamazafar at 17/03/2022.
*/

// this file will show te implementation of Higher order function (returning a function from function)
fun main() {
    /*val whichMethod = chooseMethod(2)

    // invoking the method to console
    whichMethod()*/

    /*val n = "Oh no no no no"
    for (character in  n){
        print()
    }*/

    /*val list = listOf(1,2,3,5,6,7)

    list.forEach {
        println(it)

    }*/

}



// this method will check the choice and return the method according to it
fun chooseMethod(choice: Int): ()->(Unit){




    fun two(){
        print("This is two")
    }

    // depending on the choice method is returned
    when (choice) {
        1 -> {
            return oneFunction
        }
        2 -> {
            return { println("2nd choice is good") }
        }
        else -> {
            return { println("3rd choice is good") }
        }
    }

}

val oneFunction = {
    print("This is one")
}

fun one(){
    print("This is one")
}

