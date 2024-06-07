package week_10.lab_session.random_name_picker;

import week_10.lab_session.guessing_game.Config;

import java.util.Random;

public class RandomNameSelector {

    private final Config config;
    private final Random random;
    private final String[] names;

    // Constructor
    public RandomNameSelector( String[] names ) {
        this.names = names;
        this.config = new Config(0 , names.length -1);
        random = new Random();
    }

    // Method to return random names whenever it gets called
    public String getRandomName() {
        int randomIndex = random.nextInt( ( config.getMax() - config.getMin() + 1 ) + config.getMin() );
        return names[randomIndex];
    }

}
