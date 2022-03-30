/*
* Created by usamazafar at 03/03/2022.
*/

// This class is used to store data about Truck
class Truck(private val make:String, private val model: String){

    //Download the data
    fun download(){
        println("Make -> $make \nModel -> $model")
    }

}

fun main() {

    // Download Truck data if webRequest is successful
    downloadTruckData(true) { truck ->
        truck?.download()
    }

    // Take the sum of 2 numbers given
    print(takeDecision(false) { a, b ->
       a + b
   })

}

// This functions will download the Truck data when the request is successful
fun downloadTruckData(isRequestSuccess:Boolean, downloadData: (Truck?)->(Unit)) {

    //checks the web request
    if (isRequestSuccess){
        val truck: Truck? = Truck("98", "Suzuki")
        downloadData(truck)
    }else{
        downloadData(null)
    }
}

// This function will add the numbers if the boolean is true
fun takeDecision(isTrue: Boolean, sum: (Int, Int)->(Int)): Int {
    return if (isTrue)
        sum(2,3)
    else
        sum(0,0)
}