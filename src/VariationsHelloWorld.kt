fun main(args:Array<String>) {

    // args are sent by the user to the main method
    // if the args array is empty
    if (args.isEmpty()){
        print("List is empty")
    }
    else{

        // printing the first index
        print("Hello ${
            args[0]
        }")
    }

}