package week_10.day_2.random_number_game;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersProcessor {

    // Design a class which is going to have a method to generate random numbers
    // Store random numbers in an array
    // And then print even numbers from this array
    // the array size should be set from a value being passed from a user!

    public void start() {
        // Objects
        // Arrange
        var scanner = new Scanner(System.in);
        int userInput;
        int[] numbers;

        // Action
        System.out.print("Enter the size of array: ");
        userInput = scanner.nextInt();
        numbers = generateRandomNumbers(userInput);

        // Assert --> Result
        printEvenNumbers(numbers);
//        System.out.println();
//        printOddNumbers(numbers);
    }

    // Method to generate random numbers and store them into array
    private int[] generateRandomNumbers( int size ) {
        var random = new Random();
        int[] numbers = new int[size];
        for ( int i = 0; i < size; i++ ) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    // Method to print even numbers of array
    private void printEvenNumbers( int[] numbers ) {
        System.out.print("Even numbers in this array are: ");
        for ( int number : numbers ) {
            if ( number % 2 == 0 ) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to print odd numbers of array
    private void printOddNumbers( int[] numbers ) {
        System.out.print("Odd numbers in this array are: ");
        for ( int number : numbers ) {
            if ( number % 2 != 0 ) {
                System.out.print(number + " ");
            }
        }
    }


}
