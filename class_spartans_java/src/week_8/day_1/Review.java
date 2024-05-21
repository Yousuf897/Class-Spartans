package week_8.day_1;

public class Review {

    public static void main(String[] args) {

        // Array of int
        int[] numbers = {1, 2, 3, 4, 5};

        // for loop
        for ( int number = 1; number <= 5; number++ ) {
            System.out.println(number);

        }

        System.out.println();

        // Print numbers from 1 to 5 using enhanced for loop
        for ( int number : numbers ) {
            System.out.print(number + " ");
        }
    }
}
