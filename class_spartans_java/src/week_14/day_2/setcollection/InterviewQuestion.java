package week_14.day_2.setcollection;

import java.util.ArrayList;
import java.util.HashSet;

public class InterviewQuestion {

    public static void main(String[] args) {

        int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
        HashSet<Integer> setOfNumbers = new HashSet<>();
        int countDuplicates = 0;

        // Print duplicate values
        // Get the count of duplicate values

        for ( int number : numbers ) {
            if ( !setOfNumbers.add(number) ) {
               // System.out.println( countDuplicates + 1 + ". " + number );
                System.out.print( number + " " );
                countDuplicates++;
                // setOfNumbers.add(number)
            }

        }

        System.out.println();
        System.out.println("There are " + countDuplicates + " duplicate values in array! ");
        //System.out.println( setOfNumbers );
    }


}

