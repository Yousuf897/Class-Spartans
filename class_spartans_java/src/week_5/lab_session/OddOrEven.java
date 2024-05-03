package week_5.lab_session;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

       // Write a program to check whether a number is even or odd using conditional statements.

        // Scanner to get the user input
        var scnObj = new Scanner(System.in);

        // Declare variable to store the information
        int number;

        System.out.print("Enter the number to check if even or odd: ");
        number = scnObj.nextInt();

        if ( number % 2 == 0 ) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }

}
