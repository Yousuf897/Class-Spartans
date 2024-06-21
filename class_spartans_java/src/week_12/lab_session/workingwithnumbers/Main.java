package week_12.lab_session.workingwithnumbers;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 10, 30, 50, 60, 1900, 2500, 1901, 250 };
        var config = new Config( numbers );

        // Print result
        config.printResult();

    }
}
