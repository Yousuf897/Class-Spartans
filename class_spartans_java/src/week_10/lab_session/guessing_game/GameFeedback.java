package week_10.lab_session.guessing_game;

public class GameFeedback {

    // Welcome Message Method
    public void printWelcomeMessage() {
        System.out.println(" * * * * * Welcome To Guessing Game * * * * *  ");
        System.out.println("Try to guess the correct number!");
    }

    // Method to print Too Low Message
    public void printTooLow() {
        System.out.println("Too low!");
    }

    // Method to print Too High Message
    public void printTooHigh() {
        System.out.println("Too high!");
    }

    // Method to print Success Message
    public void printSuccessMessage( int attempts ) {
        System.out.println("Congratulation! You guessed the number in " + attempts + " attempts.");
    }

}
