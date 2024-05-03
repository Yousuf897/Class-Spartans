package week_5.lab_session;

import java.util.Scanner;

public class Activity {

    // Get the first and last name of the user
    // compare the first and last name if they're equal to each other
    // if yes, --> your first and last name is the same
    // if no, --> your first and last name is not the same.

    public static void main(String[] args) {

        // Declare variables
        String firstName;
        String lastName;

        // Create object of Scanner to get the user input
        // DataType
        Scanner scnObj = new Scanner(System.in);
        var scnObjTwo = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        firstName = scnObj.next();
        System.out.print("Enter your lastName: ");
        lastName = scnObj.next();

        if ( firstName.equals(lastName) ) {
            System.out.println("your first and last name are the same");
        } else {
            System.out.println("your first and last name are not the same");
        }

    }

}
