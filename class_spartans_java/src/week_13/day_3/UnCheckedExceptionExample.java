package week_13.day_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedExceptionExample {

    public static void main(String[] args) {

        int numberOne = 0, numberTwo = 0;
        var scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter the first number: ");
            numberOne = scanner.nextInt(); // 10

            System.out.print("Please enter the second number: ");
            numberTwo = scanner.nextInt(); // 10

            System.out.println("The result of " + numberOne + " / " + numberTwo + " = " + ( numberOne / numberTwo ));

        } catch ( InputMismatchException e ) {
            System.out.println("Number cannot be divided to a character, please try again!");
        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide the number by zero!");
        }

        System.out.println("Continue execution!");


    }

}
