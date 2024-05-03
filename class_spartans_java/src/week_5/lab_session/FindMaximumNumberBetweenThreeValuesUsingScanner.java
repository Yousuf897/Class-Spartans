package week_5.lab_session;

import java.util.Scanner;

public class FindMaximumNumberBetweenThreeValuesUsingScanner {

    public static void main(String[] args) {

        // Prepare the location to store the information
        int a, b, c;

        // Object of scanner to get user inputs
        var scnObj = new Scanner(System.in);

        // Print and get the user input
        System.out.print("Please enter the first number: ");
        a = scnObj.nextInt();

        System.out.print("Please enter the second number: ");
        b = scnObj.nextInt();

        System.out.print("Please enter the third number: ");
        c = scnObj.nextInt();

        // Find the maximum number out of three numbers
        if ( a > b && a > c ) {
            System.out.println("Maximum number is: " + a);
        } else if ( b > a && b > c ) {
            System.out.println("Maximum number is: " + b);
        } else if ( c > a && c > b ) {
            System.out.println("Maximum number is: " + c);
        } else {
            System.out.println("They're equal!");
        }

    }
}
