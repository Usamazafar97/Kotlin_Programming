import java.util.Stack

/*
* Created by usamazafar at 15/03/2022.
*/


// This class is a generic stack, you can add integers, strings , objects....
class GenericStack<T>(private vararg val numbers: T){

    // converting the vararg to mutable list
    private val list = numbers.toMutableList()


    // this method will pop the last element in the list
    fun pop(): T? {
        return if (list.isNotEmpty())
            list.removeAt(list.size - 1)
        else
            null
    }

    // this method will add the element in the list
    fun push(element: T){
        list.add(element)
    }
}


// Generic function
fun <T> stackOf(vararg elements: T): Stack<T>{

//    val elementsArray = elements.toMutableList()

    // creating an empty stack
    val stackToReturn = Stack<T>()

    // filling the stack with the vararg elements
    stackToReturn.addAll(elements)

    return stackToReturn
}

fun main() {

    // object created
    val stack = GenericStack("1","2","3")

    // 1 element added
    stack.push("5")

    // popping out the lat element
    println(stack.pop())
}