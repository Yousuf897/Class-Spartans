package week_8.lab_session;

public class ForLoopActivityOne {

    public static void main(String[] args) {

        // Print numbers from 1 to 10
        for ( int number = 1; number <= 10; number++ ) {
            System.out.print( number  + " ");
        }

        System.out.println();
        String firstName = "John Doe is willing to";
        // charAt(index);
/*        System.out.println( firstName.charAt(0) ); // Empty Space will return
        System.out.println( firstName.charAt(1) );
        System.out.println( firstName.charAt(2) );
        System.out.println( firstName.charAt(3) );
        System.out.println( firstName.charAt(4) );
        System.out.println( firstName.charAt(5) );
        System.out.println( firstName.charAt(6) );
        System.out.println( firstName.charAt(7) );*/

        for ( int index = 0; index <= firstName.length() - 1; index++ ) {
            System.out.print( firstName.charAt(index) + " " );
        }

        System.out.println();

        for ( int index = 0; index < firstName.length(); index++ ) {
            System.out.print( firstName.charAt(index) + " " );
        }

        // How to get the last index of String
        int lastIndex = firstName.length() - 1;

        System.out.println( lastIndex );

    }

}
