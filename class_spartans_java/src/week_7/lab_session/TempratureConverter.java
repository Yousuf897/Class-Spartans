package week_7.lab_session;

import java.util.Scanner;

public class TempratureConverter {

  /*
  *
  * Write a java program which is going to convert C to F.
  * Prompt the user to enter a C temp and then convert it ot F
  * At the end, display the converted result into the console.
  *
  * */

    public static void main(String[] args) {

        // Declare the Scanner
        var scnObj = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        // Prompt the user for input
        System.out.print("Please enter celsius to covert into fahrenheit: ");
        celsius = scnObj.nextDouble();

        // F = (°C × 9/5) + 32
        fahrenheit = ( celsius * 9 / 5 ) + 32;

        // Display the converted value to user
        System.out.println(  celsius + " is equal to " +  fahrenheit );
        System.out.println( (int) celsius + " is equal to " + (int) fahrenheit );

    }

}
