package week_13.day_2.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HowToHandleUncheckedException {

    public static void main(String[] args) {

        try {
            var scanner = new Scanner(System.in);
            int numberOne, numberTwo;

            System.out.print("Enter the first number: ");
            numberOne = scanner.nextInt();

            System.out.print("Enter the second number: ");
            numberTwo = scanner.nextInt();

            System.out.println("Result: " + numberOne / numberTwo);

        } catch (InputMismatchException e) {
            System.out.println("Cannot divide the number by character!");
        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Java is easy!");

        String[] names = {"John", "Tony"};

        for ( String eachElement : names ) {
            System.out.println( eachElement );
        }

    }

}
