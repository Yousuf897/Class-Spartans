package week_7.lab_session;

import java.util.Scanner;

public class WorkingWithForLoopExampleTwo {

    public static void main(String[] args) throws InterruptedException {

        // I would like the user to give me the start and the end point of the numbers
        // for example if user says that I would like to see the numbers to be printed from 20 to 10
        // so your code should print the numbers from 20 to 10
        // if the user says to print the numbers from 100 to 50
        // So your code should print the numbers from 100 to 50

        // Scanner
        var scnObj = new Scanner(System.in);

        // Declare two variables to grab the input of the user
        int start, end;

        // Prompt the user to enter the start and the end
        System.out.print("Please enter the start point: ");
        start = scnObj.nextInt();

        System.out.print("Please enter the end point: ");
        end = scnObj.nextInt();

        // Print the numbers from 10 to 0
/*
        for ( int number = 10; number >= 0; number-- ) {
            Thread.sleep(1000);
            System.out.println( number );
        }
*/
        if ( start >= end ) {
        for ( int number = start; number >= end; number-- ) {
            Thread.sleep(1000);
            System.out.println( number );
            }
        } else {
            for ( int number = start; number <= end; number++ ) {
                Thread.sleep(1000);
                System.out.println( number );
            }
        }

    }

}
