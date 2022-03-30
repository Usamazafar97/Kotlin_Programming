/*
* Created by usamazafar at 07/03/2022.
*/

/*
Create a class representing a book. Every book has a title, an author, a publication year and
is either borrowed or not. Choose an appropriate data type for each of these properties.
*/

class Book(private val title: String, private val author: String, private val publicationYear: String, var isBorrowed: Boolean){

    // book is borrowed
    fun borrowBook(){
        if (isBorrowed){
            println("Sorry!!! Book is already borrowed")
        }
        else{
            isBorrowed = true
        }

    }

    // book is returned
    fun returnBook(){
        if (!isBorrowed){
            println("Sorry!!! Book is not borrowed")
        }
        else{
            isBorrowed = false
        }
    }

    // Print the details of the Book
    fun printBook(){
        println("Title -> $title\n" +
                "Author -> $author\n" +
                "Publication Year -> $publicationYear")
    }

}