package week_8.day_1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    // Computer is going to pick a number from 0 to 100
    // Your job is to find the random number

    public static void main(String[] args) {

        // Create object of Scanner to get the user input
        var scnObj = new Scanner(System.in);

        // Create object of Random to randomly pick a number in specific range
        var random = new Random();

        // Declare variables
        int userGuessedNumber = 0;
        int computerGuessedNumber;
        boolean isUserGuessedTheNumber = true;
        int score = 100;

        // Prompt the computer to pick a random number between 0 to 100
        computerGuessedNumber = random.nextInt(100 + 1);

        while ( isUserGuessedTheNumber ) {

            System.out.print("Guess a number: ");
            userGuessedNumber = scnObj.nextInt();

            if ( userGuessedNumber < computerGuessedNumber ) {
                System.out.println("Too low, go high!");
                score -= 10;
            } else if ( userGuessedNumber > computerGuessedNumber ) {
                System.out.println("Too high, go low!");
                score -= 10;
            } else {
                System.out.println("Congrats, you've found the number!");
                System.out.println("The golden number is : " + userGuessedNumber);
                System.out.println("Your total score is: "  + score);
                isUserGuessedTheNumber = false;
            }
        }

    }

}
