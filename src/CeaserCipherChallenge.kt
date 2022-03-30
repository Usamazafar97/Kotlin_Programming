/*
* Created by usamazafar at 30/03/2022.
*/


/*

In cryptography, a Caesar cipher is a simple encryption technique that shifts every letter in a message by a certain number
of letters. The number of letters to shift is known as the key or shift parameter. For example, if the key is 1, then the message:

"Codecademy is awesomez!"

becomes:

“Dpefdbefnz jt bxftpnf!”

Note how every letter in the encrypted message is one letter after each letter in the original message.

Create a Caesar cipher function that accepts an integer key and a message string as inputs. If the encrypted letter
goes beyond the letter z, it should wrap around to the beginning of the alphabet.

*/

fun encrypt(increment: Int, sentence: String): ArrayList<Char> {

    // character array to store the encrypted keys
    var characterArrayList = arrayListOf<Char>()

    // getting the ascii of every character and plus the increment
    for (character in sentence){

        // getting the ascii value of every character
        var asciiValue = character.toInt()

        // adding the added value (increment) in the actual ascii value
        var actualValue = asciiValue + increment

        // encase if the value exceeds 'z' or 'Z'
        var characterValueToAdd = 0

        // checks if the ascii value is out of scope

        // if Capital alphabet
        if (asciiValue in 65..90){

            //checking if the value exceeds 'Z'
            if (actualValue > 90){

                // taking the mod to check how much extra integers to add
                characterValueToAdd = actualValue % 90

                // add the value, above 'Z' to 'A'
                characterArrayList.add(((characterValueToAdd) + 64).toChar()) // 65 because of 'A' when added
            }
                
            //checking if the value doesn't exceed from 'Z'
            else{
                characterArrayList.add(actualValue.toChar())
            }
        }

        // if Small alphabet
        else if (asciiValue in 97..122){

            //checking if the value exceeds 'z'
            if (actualValue > 122){

                // taking the mod to check how much extra integers to add
                characterValueToAdd = actualValue % 122

                // add the value, above 'z' to 'a'
                characterArrayList.add(((characterValueToAdd) + 96).toChar()) // 97 because of 'a' when added
            }
                
            //checking if the value doesn't exceed from 'Z'
            else{
                characterArrayList.add(actualValue.toChar())
            }
        }
        
        // if anything other than capital and small alphabets
        else{ 
            
            // simply add to the character array
            characterArrayList.add(asciiValue.toChar())
        }
    }

    return characterArrayList
}


fun main() {
    print(encrypt(increment = 1, sentence = "Codecademy is awesome!"))
}
