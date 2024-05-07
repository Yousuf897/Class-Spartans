package week_6.day_1;

import java.util.Scanner;

public class ConditionalStatementExampleOne {

    public static void main(String[] args) {

        // 1 --> Monday
        // 2 --> Tuesday
        // 3 --> Wednesday

        int userInput;
        String dayOfTheWeek;

        var scnObj = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 7: ");
        userInput = scnObj.nextInt();

        dayOfTheWeek = ( userInput == 1 ) ? "Monday" : "Tuesday";

        System.out.println("Week Day: " + dayOfTheWeek );

    }

}
