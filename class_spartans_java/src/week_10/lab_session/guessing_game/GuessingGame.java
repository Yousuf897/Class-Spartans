package week_10.lab_session.guessing_game;

import java.util.Random;

public class GuessingGame {

    private final Config config;
    private final GameFeedback gameFeedback;
    private final UserInput user;
    private final int randomNumber;
    private int attempts;

    // Constructor
    public GuessingGame(Config config, GameFeedback gameFeedback, UserInput userInput) {
        this.config = config;
        this.gameFeedback = gameFeedback;
        this.user = userInput;
        Random random = new Random();
        // ( max - min + 1 ) + min
        randomNumber = random.nextInt( ( config.getMax() - config.getMin() + 1 ) + config.getMin() );
        attempts = 0;
    }

    public void startGame() {

        boolean hasUserGuessedTheNumber = false;

        gameFeedback.printWelcomeMessage();

        while ( !hasUserGuessedTheNumber ) {
            int userInput =  user.getUserGuess();

            if (userInput < randomNumber) {
                attempts++;
                gameFeedback.printTooLow();
            } else if (userInput > randomNumber) {
                attempts++;
                gameFeedback.printTooHigh();
            } else {
                gameFeedback.printSuccessMessage(attempts);
                hasUserGuessedTheNumber = true;
            }
        }
    }

}
