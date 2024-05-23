package week_8.day_3;

public class NestedForLoop {

      /*    Real-Life Analogy:

    Think of a clock. The minute hand completes a
    full cycle every hour, while the hour hand moves one position. Now, imagine
    if you were to describe the positions of both hands throughout the day. For every hour
    (each position of the hour hand),
    the minute hand goes through all its 60 positions. This repetitive action inside another
    action is similar to how nested loops operate.

    Programming Explanation:

    In programming, when you have a loop inside another loop, it's termed as "nested loops".
    The inner loop completes all its iterations for every single iteration of the outer loop.
    A nested for loop in Java looks like this:

    for (initialization1; condition1; iteration1) { --> outer loop

        for (initialization2; condition2; iteration2) { --> Inner loop
            // body of inner loop
        }
        // body of outer loop

    }

    */

    public static void main(String[] args) {

        String[][] studentNames = {

                { "Mehwand", "Farhad",   "Mathias", "Rostam", "Wasim" },
                { "Gulzai",  "Mohammad", "Mahdi", "Erin" },
                { "Bob",     "John",     "Eric"},
        };

    /*    System.out.println( studentNames.length );*/


        for ( int row = 0; row < studentNames.length; row++ ) { // OUTER LOOP STARTS

          for ( int col = 0; col < studentNames[row].length; col++ ) { // INNER LOOP STARTS
               System.out.println(" ROW [ " + row + " ]  COLUMN [ " + col + " ] = " + studentNames[row][col]);
          } // END OF INNER LOOP

            // Jump into new line!
            System.out.println();

        } // END OF OUTER LOOP

    }

    /* The inner loop completes all its iterations for every single iteration of the outer loop.
    *   2D Array of Size 3 which means 3 x 3
    *   ROW [ 0 ]  COLUMN [ 0 ] = Mehwand
    *   ROW [ 0 ]  COLUMN [ 1 ]
    *   ROW [ 0 ]  COLUMN [ 2 ]
    *
    *    ROW [ 1 ]  COLUMN [ 0 ]
    *    ROW [ 1 ]  COLUMN [ 1 ]
    *    ROW [ 1 ]  COLUMN [ 2 ]
    *
    *
*          COLUMNS     0          1         2
    *      ROW 0 { "Mehwand", "Farhad",   "Mathias" },
    *      ROW 1 { "Gulzai",  "Mohammad", "Mahdi" },
    *      ROW 2 { "Bob",     "John",     "Eric"}
    *
    * */


}
