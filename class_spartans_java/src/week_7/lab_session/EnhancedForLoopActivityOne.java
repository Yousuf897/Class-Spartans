package week_7.lab_session;

public class EnhancedForLoopActivityOne {

    /*
    *
    * Given int[] numbers = {1, 2, 3, 30, 5, 50, 7, 8, 9, 10};
    * // Find the maximum value using enhanced for loop
    *
    * */

    public static void main(String[] args) {

        // Given Array
        int[] numbers = {1, 3000, 3, 100, 5, 50, 7, 8, 9, 10, 1500, 0, 250, 1450, 2200};

        // Extra Point
        // Get the sum of all numbers
        int sumOfAllElements = 0;

        // Keep track of maximum number
        int maximumNumber = numbers[0]; // 1

        // Loop through the elements of array
        for ( int number : numbers ) {
            sumOfAllElements = sumOfAllElements + number;
            // check if the current number is greater than the maximumNumber in which we assumed first value is.
            if ( number > maximumNumber ) {
                // modify the value of maximum number
                maximumNumber = number;
            }
        }

        System.out.println("The maximum number is: " + maximumNumber);
        System.out.println("The sum of all elements in array is: " + sumOfAllElements);


    }

}
