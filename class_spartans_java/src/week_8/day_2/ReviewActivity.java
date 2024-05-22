package week_8.day_2;

import java.util.Scanner;

public class ReviewActivity {

    public static void main(String[] args) {

        var scnObj = new Scanner(System.in);
        int userInput = 0;
        String firstName = "";
        String lastName = "";
        boolean userChoice = true;

        while ( userChoice ) {

            System.out.print("Enter your firstName: ");
            firstName = scnObj.next();

            System.out.print("Enter your lastName: ");
            lastName = scnObj.next();

            System.out.println(" * * * * * Menu * * * * * ");
            System.out.println("1. Print firstName: ");
            System.out.println("2. Print lastName: ");
            System.out.print("Your choice: ");
            userInput = scnObj.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("First Name: " + firstName);
                    break;
                case 2:
                    System.out.println("last Name: " + lastName);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
                    System.out.println("Would you like to try again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Select your choice: ");
                    userInput = scnObj.nextInt();

                    switch (userInput) {
                        case 1:
                            userChoice = true;
                            break;
                        case 2:
                            userChoice = false;
                            break;
                        default:
                            System.out.println("invalid entry!");
                    }
            }

        }

    }

}
