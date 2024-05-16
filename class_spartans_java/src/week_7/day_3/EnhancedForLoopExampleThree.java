package week_7.day_3;

import java.util.Scanner;

public class EnhancedForLoopExampleThree {

      /*
    Print Array Elements
    You are given an array of integers: int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};
    Write a program using a for loop that prints the elements in the array.
    Print even and odd numbers from the array

    // NOTE: USE SCANNER TO GET THE INPUT OF THE USER
    // BASED ON THE INPUT OF THE USER, DECIDE BETWEEN PRINTING ODD OR EVEN NUMBERS

    // FOR EXAMPLE

    1. Print Even Numbers
    2. Print Odd Numbers
    Please select one of the options: X
    // if Y --> Invalid Entry, Please try again.

    if user enters 1, --> Print even numbers
    else, print odd numbers
*/

    public static void main(String[] args) {

        // Preparing the data in which you need to complete your code
        int userInput;
        var scnObj = new Scanner(System.in);
        int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};

        // Actions
        System.out.println("1. Print Even Numbers ");
        System.out.println("2. Print Odd Numbers");
        System.out.print("Please select one of the options: ");
        userInput = scnObj.nextInt();
        if ( userInput != 1 && userInput != 2 ) System.out.println("Invalid entry, please re-enter the option!");

        switch ( userInput ) {
            case 1:
                int countEven = 0;
                for ( int number : numbers  ) {
                    if ( number % 2 == 0 ) {System.out.print( number + "  "); countEven++;}
                }
                break;
            case 2:
                int countOdd = 0;
                for ( int number : numbers  ) {
                    if ( number % 2 != 0 ) {System.out.print( number + " " ); countOdd++;}
                }
                break;
            default:
                System.out.println("Invalid entry!");
        }

    }

}
