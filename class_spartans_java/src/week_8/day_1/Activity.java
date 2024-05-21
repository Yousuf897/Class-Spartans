package week_8.day_1;

import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        // Ask the user to enter a number
        // Get the number and print the multiplication table for that number
        // For example
        // Enter a number: 2
        /*
        * Expected output:
        * 1 * 2 = 2
        * 2 * 2 = 4
        * 3 * 2 = 6
        * ..
        * ..
        * 10 * 2 = 20
        * */

        // Create the object of scanner
        var scnObj = new Scanner(System.in);

        // Variable to store the user input
        int userInput = 0;
        int startPoint = 0;
        int endPoint = 0;
        int result = 0;


        // Print a message for the user and ask them for a number
        System.out.print("Please enter a number to print it's multiplication table: ");
        userInput = scnObj.nextInt();

        System.out.print("Please enter the start point for multiplication table: ");
        startPoint = scnObj.nextInt();

        System.out.print("Please enter the end point for multiplication table: ");
        endPoint = scnObj.nextInt();

        // Create a loop to print the numbers from 1 to 10
        for ( int number = startPoint; number <= endPoint; number++ ) {
            if ( number % 2 == 0 ) {
                System.out.println(number + " * " + userInput + " = " + (number * userInput));
                result = result + number * userInput;
            }
        }

        System.out.println("Total: " + result);

    }
}
