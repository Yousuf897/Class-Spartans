package week_8.day_3;

public class LocalScope {

    /*
    *
    *    1. Local Scope (Method/Block Scope):
    •	Variables declared within a method or block are local to that method or block.
    •	They cannot be accessed outside of that method or block.
    •	Their lifetime starts when the method or block is entered and ends when it exits.
    * */

    public static void main(String[] args) { // Main Method Block opened
        int number = 10;
        String firstName = "Bob";

        System.out.println( number );
        System.out.println(firstName);

        if ( true ) { // Block of if statement starts
            String lastName = "Doe";
            System.out.println(lastName);
        } // Block of if statement ends

       // System.out.println(lastName); // OUT OF SCOPE! It can be only accessed within if statement block

        for ( int index = 0; index <= 2; index++ ) { // Loop Block Starts
            System.out.println( index );
        } // Loop Block Ends

       // System.out.println( index ); // OUT OF SCOPE! It only can be Accessed within the loop Block


    } // Main Method Block Closed

      // System.out.println( number ); // OUTSIDE OF THE MAIN BLOCK OR METHOD ( OUT OF SCOPE )
     //  System.out.println(firstName); // OUTSIDE OF THE MAIN BLOCK OR METHOD ( OUT OF SCOPE )

}

