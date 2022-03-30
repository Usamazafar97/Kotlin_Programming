/*
* Created by usamazafar at 11/03/2022.
*/

open class Clock{
    open fun run(){
        println("running...")
    }
}

interface Watches{
    fun run(){
        println("Watch running..")
    }
}

class WallClock: Clock(), Watches{
    override fun run() {
        super<Watches>.run() // if specific for watches
        println("Wall clock running")
    }

}


fun main() {

    val obj = WallClock()
    obj.run()

}