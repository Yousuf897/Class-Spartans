package week_8.day_2;

public class PrintElementsOfTwoDimensionArray {

    public static void main(String[] args) {

        // Create 1D array of String
/*        String[] studentNames = {"Bob", "John", "Tony", "Eric"};*/

        // Print the elements of array using Loops
/*        for ( String name : studentNames ) {
            System.out.println(name);
        }*/

/*        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.println( studentNames[index] );
        }*/

        String[][] studentNames = {
                {"John", "Bob"},                         // Row 0 --> 2
                {"Mathias", "Mostepha", "Mohammad"},    // Row 1 --> 3
                {"Hamed", "Mahdi",}                     // Row 2 --> 2
        };

       for ( int row = 0; row < studentNames.length; row++ ) { // Outer Loop
           System.out.println(" * * * * * Printing the values from row " + row + "  * * * * * ");
           for ( int col = 0; col < studentNames[row].length; col++ ) { // Inner Loop
              /* System.out.println( "Row " + row + "  --> " + studentNames[row].length );*/
             //  Row [0] Col [0] = John
               System.out.println( "Row [" + row + "] Col [" + col + "] = " + studentNames[row][col]);
           }
           System.out.println(" * * * * * Finished Printing values from row" + row + "  * * * * * ");
           System.out.println();
       }
    }
/*
    {"John", "Bob"}
    {"Mathias", "Mostepha", "Mohammad"},
    {"Hamed", "Mahdi",}
*/

    /*
    *   Row [0] Col [0] = John
    *   Row [0] Col [1] = Bob
    *
    *   Row [1] Col [0] = Mathias
    *   Row [1] Col [1] = Mostepha
    *   Row [1] Col [2] = Mohammad
    *
    *   ,,
    *
    * */

}
