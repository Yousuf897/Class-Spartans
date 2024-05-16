package week_7.day_3;

public class ForLoopActivityTwo {

    // Given an array of int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};
    // Print only Even numbers
    // Extra Point: Count how many even numbers have you found!
    // Extra Point: Count how many odd numbers have you found!

    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};

        for ( int index = 0; index < numbers.length; index++ ) {

            // Check if the current number is even
            if ( numbers[index] % 2 == 0 ) {
                countEven++;
                System.out.print(numbers[index] + " ");
            } else {
                countOdd++;
            }
        }
        System.out.println();
        System.out.println("We have found " + countEven + " even numbers!");
        System.out.println("We have found " + countOdd + " odd numbers!");

    }

}
