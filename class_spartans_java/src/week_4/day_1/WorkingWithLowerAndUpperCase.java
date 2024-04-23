package week_4.day_1;

public class WorkingWithLowerAndUpperCase {

    // toLowerCase(): Return the lower case version of your String.
    // toUpperCase(): Return the upper case version of your String.

    public static void main(String[] args) {

        String firstName = "TONY";
        String lastName = "alexander";

        // Change the firstName to all lowerCase version.
        // Chagne the lastName to all upperCase version.

        // Task 01:
        System.out.println( firstName );
        System.out.println( firstName.toLowerCase() );
        firstName = firstName.toLowerCase();
        System.out.println( firstName ); // TONY, lowerCase.

        // Task 02:
        System.out.println( lastName );
        System.out.println( lastName.toUpperCase() );
        System.out.println( lastName );

    }

}
