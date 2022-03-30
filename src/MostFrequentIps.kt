import java.io.File

/*
* Created by usamazafar at 16/03/2022.
*/

fun main() {

    // this map contains ips and its count
    val ipsMap: Map<String,Int> = readFileAndFillMap()

    // find the most frequently used ip
    val mostFrequentIp = findFrequentIp(ipsMap)

    // if ip is found
    if (mostFrequentIp != null) {
        println("Most frequent Ip: ${mostFrequentIp.key}")
    }

}

// this function finds the most entry with most ip count
fun findFrequentIp(ipsMap: Map<String, Int>): Map.Entry<String, Int>? {
    return ipsMap.maxByOrNull { it.value }
}

// this function read file and fill the map
fun readFileAndFillMap(): MutableMap<String, Int> {

    // map containing the ip and its count
    val ipMap = mutableMapOf<String,Int>()

    // reading the file line by line
    File("src/ips.txt").forEachLine { singleLine ->

        // checking if the ip already there increment its count
        if (ipMap.contains(singleLine)){

            // ipCount contains the previous count
            var ipCount = ipMap[singleLine]!!

            // incrementing the previous count
            ipCount+=1

            // setting the new count
            ipMap[singleLine] = ipCount
        }

        else{

            // if the map doesn't contain the ip its count is 0
            ipMap[singleLine] = 0
        }
    }

    return ipMap
}
