import java.io.File

/*
* Created by usamazafar at 16/03/2022.
*/

fun main() {

    // opening the file of named inputfile.txt
    File("src/inputfile.txt").forEachLine { line ->
        println(line)
    }
}