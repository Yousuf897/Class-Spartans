package week_8.day_3;

public class NestedForLoopActivity {

    public static void main(String[] args) throws InterruptedException {

        // Given 2D Array of Integer, print all values
        // Test your code, add and remove values from array and make sure
        // values are being printed into the console.

        int[][] array2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20, 21}
        };

        for ( int row = 0; row < array2D.length; row++ ) { // OUTER LOOP

            for ( int col = 0; col < array2D[row].length; col++ ) { // INNER LOOP
                System.out.println("[ " + row + " ] [ " + col + " ] = " + array2D[row][col]);
                Thread.sleep(1000);
            }
            System.out.println();
        }

    }

}
