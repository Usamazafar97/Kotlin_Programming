/*
* Created by usamazafar at 03/03/2022.
*/

fun main() {

    // simple map that is immutable, new items can't be added
    val carBelongingsSimpleMap = mapOf(1 to "Usama", 2 to "Anas", 3 to "Abubakkar")

    // hashMap is mutable, new items can be added
    val carBelongingsHashMap = hashMapOf(1 to "Usama", 2 to "Anas", 3 to "Abubakkar")



    // show values of the map
    carBelongingsSimpleMap.values

    // show the keys only
    carBelongingsSimpleMap.keys


    // 1 new entry is added in the Map
    carBelongingsHashMap[4] = "hallo"


    // printing the whole map
    print(carBelongingsHashMap)

}