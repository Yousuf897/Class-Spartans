package week_7.lab_session;

public class WorkingWithLoops {

    /*
    *
    * Given an array of String
    * Print the elements of array using for loop
    *
    *
    * */

    public static void main(String[] args) {

        String[] message = {"Welcome ", "to TekSchool ", "and", "java", " is", " easy", " to ", "learn"};

        // Print the elements of message array
        /*
        * for ( initialization; condition; iteration; ) {
        *       // Body of loop
        *   }
        *
        * */

        for ( int index = 0; index < message.length; index++ ) {
            System.out.println( message[index] );
//            System.out.print( message[index]+ " " );
        }

    }
}
