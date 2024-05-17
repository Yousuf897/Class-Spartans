package week_7.lab_session;

import java.util.Scanner;

public class ArraysActivityOne {

    // Working with Arrays

    // Question 01
    /*    Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.

*/

    public static void main(String[] args) {

        // Scanner
        var scnObj = new Scanner(System.in);
        int userChoice;

        // Declare an array of String
        String[] teamNames = {
                "Blazers", "Breaking Boundaries", "Brick Breakers",
                "Busy Buzzers", "Court Crusaders",
        };

        // Print a menu and ask the user choice
        System.out.println("Select from the options below!");
        System.out.println("1. Top Ranked");
        System.out.println("2. Second Top Ranked");
        System.out.println("3. Third Top Ranked");
        System.out.println("4. Fourth Top Ranked");
        System.out.println("5. fifth Top Ranked");
        System.out.print("Please enter your choice: ");
        userChoice = scnObj.nextInt();

        switch ( userChoice ) {
            case 1:
                System.out.println("Top Ranked Team Name is: " + teamNames[0] );
                break;
            case 2:
                System.out.println("Second Top Ranked Team Name is: " + teamNames[1] );
                break;
            case 3:
                System.out.println("Third Top Ranked Team Name is: " + teamNames[2] );
                break;
            case 4:
                System.out.println("Fourth Top Ranked Team Name is: " + teamNames[3] );
                break;
            case 5:
                System.out.println("Fifth Top Ranked Team Name is: " + teamNames[4] );
                break;
            default:
                System.out.println("Invalid entry!");
        }

    }


}
