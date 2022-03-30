/*
* Created by usamazafar at 03/03/2022.
*/

fun main() {

    val checkNullString: String? = "This is not null"

    // There are 4 ways to check the nullability of the string

    // Elvis operator
    val value = checkNullString?.length ?: 0

    // Safe call operator
    val value2 = checkNullString?.length

    //!!
    val value4 = checkNullString!!.length

    // Null check
    val value3 = if (checkNullString != null) checkNullString.length else 0

}