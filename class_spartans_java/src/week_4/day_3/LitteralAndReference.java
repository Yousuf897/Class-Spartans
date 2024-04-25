package week_4.day_3;

public class LitteralAndReference {


    /*

    Literal vs. Reference Variable:

    An Analogy Imagine a bookshelf with a collection of books.

    Literal: A literal would be like writing a note with the book's title on it. For example,
    a note saying "Harry Potter" represents that specific book, just as the number 5 represents
    that specific integer.

    Reference Variable: A reference variable would be like having a bookmark with an instruction
    on where to find a specific book. For example, "3rd shelf, 5th book from the left". || Reference (index)
    This bookmark doesn't hold the book's content, but it points you to its location,
    just like a reference variable doesn't hold the object's content but points to its location in
    memory.

*/

    public static void main(String[] args) {
        int numberFive = 5; // Litteral
        String str1 = "Hello";
        int number = 10;
        String message = "Hello, welcome to TekSchool";

        System.out.println( str1.hashCode() );
        System.out.println( message.hashCode() );

        message = "Hello";

        System.out.println( message.hashCode() );

        str1 = "Hello, welcome to TekSchool";

        System.out.println( str1.hashCode() );
    }


}
