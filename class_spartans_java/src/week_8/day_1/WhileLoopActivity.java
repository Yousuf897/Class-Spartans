package week_8.day_1;

import java.util.Scanner;

public class WhileLoopActivity {

    /*
    * Ask the user for a number
    *  Print the multiplication table using while loop
    *   from start to endPoint
    *   Where start and end are numbers entered by the user
    *
    *  */

    public static void main(String[] args) {

        /*
        *  --  While Loop Syntax --
        *
        * Initialization;
        * while ( condition ) {
        *       body of loop
        *       Iteration;
        *   }
        * */

        // Create object of Scanner
        var scnObj = new Scanner(System.in);

        // Declare variables to store the values
        int userInput = 0;
        int startPoint = 0;
        int endPoint = 0;

        // Print messages and get userInput
        System.out.print("Please enter a number to print it's multiplication table: ");
        userInput = scnObj.nextInt();

        System.out.print("Please enter the start point for multiplication table: ");
        startPoint = scnObj.nextInt();

        System.out.print("Please enter the start point for multiplication table: ");
        endPoint = scnObj.nextInt();

        while ( startPoint <= endPoint ) {
            System.out.println( startPoint + " * " + userInput + " = " + ( userInput * startPoint ) );
            startPoint++;
        }

        /*
        * startPoint * userInput = ( userInput * startPoint )
        * 12 * 65 =
        * */

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * */

    }

}
