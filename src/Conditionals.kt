fun main(args: Array<String>) {

    // variable to store age
    var age = 31

    // on the basis of age print the correct id
    when(age){
        1 -> print(1)
        2 -> print(2)
        3 -> print(3)
        4 -> print(4)

        // if no id is selected then the else statement will run
        else-> print("else")
    }
}