package week_8.day_2;

public class NestedLoopActivityFour {

    /*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * */

    public static void main(String[] args) {

        // one loop to print the rows
        for ( int row = 1; row <= 6; row++) {
            for ( int col = 1; col <= row; col++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for ( int row = 5; row >= 1; row--) {
            for ( int col = 1; col <= row; col++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

 /*          *
             *  *
             *  *  *
             *  *  *  *
             *  *  *  *  *
             *  *  *  *  *  *
             *  *  *  *  *
             *  *  *  *
             *  *  *
             *  *
             *
*/


}
