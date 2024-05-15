package week_7.day_2;

import java.util.Scanner;

public class BookShelfOrganizer {

    /*
    Bookshelf Organizer:

    Objective: Store a collection of book titles and retrieve a book by its position on the shelf.

    Steps:

    Declare a 1D array to hold a certain number of book titles.
    Assign a book title to each position in the array.
    To find the title of the book that's 3rd from the left, access the element at index 2.
    Print the book title retrieved from the array.

    // NOTE: User Scanner!
*/

    public static void main(String[] args) {

        // Create an array of size 5 one dimension array and use scanner to get input from the user.

        String[] bookTitles = new String[5];
        var scanner = new Scanner(System.in);

        System.out.println("First title" );
        bookTitles[0] = scanner.nextLine();

        System.out.println("Enter second title ");
        bookTitles[1] = scanner.nextLine();


        System.out.println("Enter third title ");
        bookTitles[2] = scanner.nextLine();


        System.out.println("Enter fourth title ");
        bookTitles[3] = scanner.nextLine();

        System.out.println("Third Book from left " + bookTitles[2] );

    }

}
