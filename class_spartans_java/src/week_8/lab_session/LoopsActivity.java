package week_8.lab_session;

import java.util.Random;

public class LoopsActivity {

    public static void main(String[] args) {

        // Fill in the array with random numbers from 1 to 15
        Random random = new Random();

        int[] arrayOfNumbers = new int[20];

        for ( int index = 0; index < arrayOfNumbers.length; index++ ) {
            int randomNumber = random.nextInt(15) + 1;
            arrayOfNumbers[index] = randomNumber;
            System.out.print( arrayOfNumbers[index] + " ");
        }

    }

}
