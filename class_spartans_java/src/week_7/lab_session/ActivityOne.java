package week_7.lab_session;

import java.util.Scanner;

public class ActivityOne {

    /*
    Online Game Access

    Objective: Check if a user can access a specific level in an online game.

    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.

    The user provides their details:

    boolean isVIP = false;
    int gameHoursPlayed = 105;

    (Both values can be changed for testing)

    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/

    public static void main(String[] args) {

        var scnObj = new Scanner(System.in);
        boolean isVIP = false;
        int gameHoursPlayed;
        int userChoice;

        // Print message and ask the values from the user
        System.out.println("Are you a VIP member of the game: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please select one of the options: ");
        userChoice = scnObj.nextInt();

        if ( userChoice == 1 ) isVIP = true;
        else if ( userChoice == 2 ) isVIP = false;
        else System.out.println("Invalid entry, please select again!");

        switch ( userChoice ) {
            case 1:
                isVIP = true;
                break;
            case 2:
                isVIP = false;
                break;
            default:
                System.out.println("Invalid entry!");
        }

        System.out.println( " * * * * *  * * * * *  * * * * *  " );
        System.out.print("How many hours have you played the game? ");
        gameHoursPlayed = scnObj.nextInt();

        //  if VIP member or hoursPlayed is greater than 100
        if ( isVIP || gameHoursPlayed > 100 ) System.out.println("Access granted");
        else System.out.println("Access Denied");

    }


}
