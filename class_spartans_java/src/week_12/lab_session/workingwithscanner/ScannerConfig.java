package week_12.lab_session.workingwithscanner;

import java.util.Scanner;

public class ScannerConfig {

    private static final Scanner scanner = new Scanner(System.in);

    // A method to return int value
    public static int getIntInput(String prompt) {
        FeedBack.displayMessage(prompt);
        return scanner.nextInt();
    }

    // A method to return String value
    public static String getStringInput(String prompt) {
        FeedBack.displayMessage(prompt);
        return scanner.next();
    }

}
