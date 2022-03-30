/*
* Created by usamazafar at 11/03/2022.
*/

fun main() {

    // marking the label here@
    here@ for (i in 0..10){
        for (j in 0..10){

            // return the flow to the label mentioned
            break@here
        }
    }
}