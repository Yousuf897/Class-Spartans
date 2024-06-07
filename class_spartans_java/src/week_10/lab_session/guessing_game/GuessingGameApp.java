package week_10.lab_session.guessing_game;

public class GuessingGameApp {

    public static void main(String[] args) {

        // Objects
        var config = new Config(1, 100);
        var gameFeedback = new GameFeedback();
        var userInput = new UserInput();
        var guessingGame = new GuessingGame(config, gameFeedback, userInput);
        guessingGame.startGame();

    }

}
