package week_6.day_3;

public class BookHeightCompare {

    /*
    Question: Book Height Comparison

    You have two books with different heights: double book1Height = 9.5; and double book2Height = 7.0;.
    Compare the heights of the two books.

    Determine:

    Which book is taller.
    If any book is shorter or of the same height as the other.
    Print out the results of your comparisons.

*/

    public static void main(String[] args) {

        double book1Height = 9.5;
        double book2Height = 9.5;

        if ( book1Height < book2Height ) System.out.println("Book 2 is taller");
        else if ( book1Height > book2Height ) System.out.println("Book 1 is taller");
        else System.out.println("Both books are having the same height!");



    }

}
