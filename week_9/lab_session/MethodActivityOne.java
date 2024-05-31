package week_9.lab_session;

import java.util.Scanner;

public class MethodActivityOne {

    public static void main(String[] args) {
        var scnObj = new Scanner(System.in);
        printCelsiusToFahrenheit( getUserInput(scnObj) ); // 30
    }
    // Create a method which is going to Covert C to F
    // F = (°C × 9/5) + 32
    public static double celsiusToF( int celsius ) {
        return ( celsius * 9 / 5 ) + 32;
    }

    // System.out.println( userInput + " value in celsius = " + celsiusToF(userInput));
    public static void printCelsiusToFahrenheit (int userInput) {
        System.out.println( userInput + " value in celsius = " + (int) (celsiusToF(userInput)) );
    }

    public static int getUserInput( Scanner scnObj ) {
        System.out.print(" Please enter a value to convert from C to F:  ");
        return scnObj.nextInt(); // 30
    }
}
