import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.Scanner

/*
* Created by usamazafar at 16/03/2022.
*/

class Hangman {

    // count the wrong guesses
    var wrongGuesses = 0

    // the user input the word
    lateinit var wordToGuess: String

    // the actual you are guessing
    private var guessedWord = mutableListOf<Char>()

    // variable for taking the input from the user
    private val input = Scanner(System.`in`)

    // this method will take input a single character from the user
    private fun inputLetter(): Char {

        print("Please enter the character: ")

        return input.next().single()
    }

    // this method will take input the word to guess from the user
    private fun inputWordToGuess(){
        print("Please enter the word: ")

        wordToGuess = input.next()

        println()

        // filling the guessedWord with "_"
        for (index in wordToGuess.indices){
            guessedWord.add('_')
        }
    }

    // this method will check the letter, user entered against the word to guess
    private fun checkGuessedLetter(guessedLetter: Char ){

        var isGuessed = false

        // checking string for the guessed character
        for (index in wordToGuess.indices) {
            if(wordToGuess[index] == guessedLetter){
                guessedWord[index] = guessedLetter

                isGuessed = true
            }

        }

        // if wrong guessed
        if (!isGuessed)
            wrongGuesses++


        printGuessedWord()
    }

    // this method will print the word
    private fun printGuessedWord(){
        println("Guesses Left: ${10 -  wrongGuesses}")
        for (item in guessedWord){
            print(item)
        }
        println()
    }

    // checks if th user guessed the right word
    private fun checkGuessedWord(): Boolean {

        // checking the whole list
        for (index in guessedWord.indices){

            // if any character doesn't match , return false
            if (wordToGuess[index] != guessedWord[index]){
                return false
            }
        }
        return true
    }

    fun playGame(){

        // the user will enter the word
        inputWordToGuess()

        // loop until the wrong guesses are 10 or the user guessed the word correctly
        while (true){
            val enteredCharacter = inputLetter()

            println()
            checkGuessedLetter(enteredCharacter)

            // if the user guessed the word correctly
            if (checkGuessedWord()){
                println("Congratulations!!!! You guessed the word right")
                return
            }else if (wrongGuesses == 10){
                println("Sorry!!!! Your tries are over")
                return
            }

        }
    }

}

fun main() {

    Hangman().playGame()

}