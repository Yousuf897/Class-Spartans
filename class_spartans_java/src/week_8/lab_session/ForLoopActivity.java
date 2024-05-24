package week_8.lab_session;

public class ForLoopActivity {

    public static void main(String[] args) {

        // Create an empty array
       int[] numbers = new int[15];

       // Loop to start from 1 to 15 and fill the array with 15 values
        for ( int number = 1; number <= 15; number++ ) {
            numbers[number - 1] = number;
            // numbers[index] = X;
        }

        for ( int number : numbers ) {
            System.out.print( number + " ");
        }


    }

}
