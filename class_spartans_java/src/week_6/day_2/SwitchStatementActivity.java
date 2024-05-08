package week_6.day_2;

import java.util.Scanner;

public class SwitchStatementActivity {

    /*
     * 1. Display Your Name
     * 2. Display your lastName
     * 3. Display your dateOfBirth
     * 4. Display name and lastName
     * */

    /*
     *  If I press option 1
     *   John
     * */


    public static void main(String[] args) {

        String firstName, lastName, dateOfBirth;
        int userChoice;

        // Scanner object
        var scnObj = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        firstName = scnObj.next();

        System.out.print("Enter your lastName: ");
        lastName = scnObj.next();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = scnObj.next();

        System.out.println(" * * * * * *  MENU  * * * * * * ");

        System.out.println("Please select one of the options");
        System.out.println("1. Display Your Name");
        System.out.println("2. Display your lastName");
        System.out.println("3. Display your dateOfBirth");
        System.out.println("4. Display name and lastName");
        System.out.print("Your choice: ");
        userChoice = scnObj.nextInt();

        System.out.println(" * * * * * *  * * * * * *  * * * * * * ");

        switch ( userChoice ) {
            case 1:
                System.out.println("Your firstName is: " + firstName);
                break;
            case 2:
                System.out.println("Your lastName is: " + lastName);
                break;
            case 3:
                System.out.println("Your date of birth is: " + dateOfBirth);
                break;
            case 4:
                System.out.println("Your full name is: " + firstName + " " + lastName);
                break;
            default:
                System.out.println("Invalid choice, please try again!");

        }

    }

}
