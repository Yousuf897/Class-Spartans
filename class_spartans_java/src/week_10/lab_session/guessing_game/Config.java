package week_10.lab_session.guessing_game;

public class Config {

    // Variables
    private int min;
    private int max;

    // Constructor
    public Config(int min, int max) {
        setMin(min);
        setMax(max);
    }

    // Getters
    public int getMax() {return max;}
    public int getMin() {return min;}

    // Setters
    private void setMin(int min) {this.min = min;}
    private void setMax(int max) {this.max = max;}
}
