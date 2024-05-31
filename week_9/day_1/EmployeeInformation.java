package week_9.day_1;

import java.util.Scanner;

public class EmployeeInformation {

    // Properties of a class
    // Variables
    // Methods
    // Single UNIT --> ENCAPSULATION!

     String firstName;
     String lastName;

    public void getUserFirstAndLastName() {
        // Object of Scanner
        var scnObj = new Scanner(System.in);
        int userInput = 0;

        System.out.print("Please enter your firstName: ");
        firstName = scnObj.next();

        System.out.print("Please enter your lastName: ");
        lastName = scnObj.next();
    }

    // Create a method to print a menu for the user
    public int printMenuAndGetUserInput() {
        // Object of Scanner
        var scnObj = new Scanner(System.in);
        int userInput = 0;
        System.out.println(" * * * * *  * * * * *  Menu  * * * * *  * * * * *  ");
        System.out.println("1. Print Full Name");
        System.out.println("2. Print First Name");
        System.out.println("3. Print Last Name");
        System.out.print( "Select one Option: " );
        return userInput = scnObj.nextInt();
    }

    // A method to determine what needs to be printed based on the userInput
    public void printBasedOnUserInput( int input ) {
        switch (input) {
            case 1:
                System.out.println("Your Full Name is: " + firstName + " " + lastName);
                break;
            case 2:
                System.out.println("Your First Name: " + firstName);
                break;
            case 3:
                System.out.println("Your Last Name: " + lastName);
                break;
            default:
                System.out.println("Invalid Entry, Please try again!");
        }
    }

}
