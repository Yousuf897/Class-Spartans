package week_10.lab_session.guessing_game;

import java.util.Scanner;

public class UserInput {

    // Variable
    private final Scanner scanner;

    // Constructor
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Method to take the int user input
    public int getUserGuess() {
        System.out.print("Guess your number: ");
        return scanner.nextInt();
    }

    // Method to Close Object of Scanner
    public void close() {
        scanner.close();
    }



}
