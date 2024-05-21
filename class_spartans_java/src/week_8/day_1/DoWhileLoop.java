package week_8.day_1;

import java.util.Scanner;

public class DoWhileLoop {

    // When a loop is going to run?
    // When the condition is true

    public static void main(String[] args) {

/*        // Initialization
        do {
            // Initialization
            // Iteration
        } while ( condition );

        */

        // Print a student Name based on the condition 5 times
        for ( int attempts = 1; attempts < 1; attempts++ ) {
            System.out.println("Bob");
        }

        // Using do while loop
        int attempts = 1;
        do {
            System.out.println("Bob");
            attempts++;
        } while ( attempts <= 5 );


        String systemUserName = "John";
        String systemPassword = "John!@#123";
        boolean isUserNameOrPasswordCorrect = true;

        String userInputUserName = "";
        String userInputPassword = "";

        int wrongAttempts = 5;

        var scnObj = new Scanner(System.in);

        do {
            // Ask the user for their username
            System.out.print("Enter your userName: ");
            userInputUserName = scnObj.next();

            // Ask the user for their password
            System.out.print("Enter your password: ");
            userInputPassword = scnObj.next();

            if (userInputUserName.equals(systemUserName) && userInputPassword.equals(systemPassword)) {
                System.out.println("Access granted!");
                isUserNameOrPasswordCorrect = false;
            } else {
                System.out.println("Invalid username or password, try again!");
                wrongAttempts--;
                System.out.println("You have " + wrongAttempts + " remaining attempts!");
                if ( wrongAttempts == 0 ) System.out.println("Come back after 30 mins MR!");
            }
        } while ( isUserNameOrPasswordCorrect && wrongAttempts > 0 );

    }

}
