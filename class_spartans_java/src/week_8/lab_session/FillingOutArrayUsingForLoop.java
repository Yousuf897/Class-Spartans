package week_8.lab_session;

import java.util.Scanner;

public class FillingOutArrayUsingForLoop {

    public static void main(String[] args) {

        var scnObj = new Scanner(System.in);
        int userInput = 0;

        // Ask the user for input to create an array of that size
        System.out.print("Please enter a value to create an array: ");
        userInput = scnObj.nextInt(); // 1 // 2 / 3

        // Create an array with the size that is being captured from user
        int[] numbers = new int[userInput];
        int[] evenNumbers = new int[userInput];
        int[] oddNumbers = new int[userInput];

        // Create a loop to fill up the array with numbers depending on X size
        for ( int value = 1; value <= numbers.length; value++ ) {
            // nameOfYourArray[index] = value;
            numbers[value - 1 ] = value;
        }

        // Print the elements of array
        for ( int eachvalueInArray : numbers ) {
            System.out.print( eachvalueInArray + " " );
        }

        // Jump into new line!
        System.out.println();

        System.out.println( " * * * * * * * * * * * * * * * * * * * *  " );

        // Create a loop that is going to fill your array with evenNumbers
        for ( int evenValue = 0; evenValue < evenNumbers.length; evenValue++ ) {
            // nameOfArray[index] = value;
            // Before adding values to array, check if they're even, if yes add the value
            if ( evenValue % 2 == 0 ) {
                evenNumbers[evenValue] = evenValue;
            }
        }

        // Print  the elements of evenNumbersArray
        for ( int number : evenNumbers ) {
            System.out.print( number + " " );
        }

        // Jump into new line!
        System.out.println();

        System.out.println( " * * * * * * * * * * * * * * * * * * * *  " );

        // Create a loop that is going to fill your array with evenNumbers
        for ( int evenValue = 0; evenValue < oddNumbers.length; evenValue++ ) {
            // nameOfArray[index] = value;
            // Before adding values to array, check if they're odd, if yes add the value
            if ( evenValue % 2 != 0 ) {
                oddNumbers[evenValue] = evenValue;
            }
        }

        // Print  the elements of evenNumbersArray
        for ( int number : oddNumbers ) {
            System.out.print( number + " " );
        }

        // 0 1 2 3 4 5
    }

}
