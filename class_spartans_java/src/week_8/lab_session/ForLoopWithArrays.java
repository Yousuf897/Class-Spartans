package week_8.lab_session;

public class ForLoopWithArrays {

    public static void main(String[] args) {

        // length                   1       2       3       4          5        6
        String[] studentNames = {"John", "Eric", "Tony", "James", "Mathias", "Eric"};
        // index                    0       1       2       3          4        5

        // Print the elements of array manually
        // nameOfArray[index];

/*        System.out.println( studentNames[0] );
        System.out.println( studentNames[1] );
        System.out.println( studentNames[2] );
        System.out.println( studentNames[3] );*/

/*        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.println( studentNames[index] );
        }*/

        // Print values with some edits
        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.println(  "[ " + studentNames[index] + " ]" );
        }
          /*
        *  [ John ]
          [ Eric ]
          Tony
          James
          Mathias
        *
        * */

             /*
        * 1. John
          2. Eric
          3. Tony
          4. James
          5. Mathias
        *
        * */

        // Print values with some edits
        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.println(  index + 1 + ". " + studentNames[index] );
        }
        /*
        * [0] = John
          [1] = Eric
          [2] = Tony
          [3] =  James
          [4] = Mathias
        *
        * */

        // Print values with some edits
        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.println( "[" + index + "] = " + studentNames[index] );
        }

    }

}
