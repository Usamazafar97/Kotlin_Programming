import kotlin.random.Random

fun main() {

    // variable to store random number
    var randomNumber = Random.nextInt(50) + 1


    // when statement to check the correct the placement of random number
    when(randomNumber){
        in 1..10 -> print("in range of 1 to 10 and the number is $randomNumber")
        in 11..20 -> print("in range of 11 to 20 and the number is  $randomNumber")
        in 21..30 -> print("in range of 21 to 30 and the number is  $randomNumber")
        in 31..40 -> print("in range of 31 to 40 and the number is  $randomNumber")
        in 41..150 -> print("in range of 41 to 50 and the number is  $randomNumber")
    }

}