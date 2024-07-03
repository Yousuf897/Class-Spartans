package week_14.day_2;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {

        int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Print the unique values
        for ( int i = 0; i < numbers.length; i++ ) {
            boolean isUnique;
            for ( int j = 0; j < i; j++ ) {
                isUnique = true;
                if ( numbers[j] == numbers[i] ) {
                    isUnique = false;
                    break;
                }
                if ( isUnique ) {
                    uniqueNumbers.add(numbers[i]);
                }
            }
            System.out.println();
        }
        System.out.println( uniqueNumbers );
    }
}
