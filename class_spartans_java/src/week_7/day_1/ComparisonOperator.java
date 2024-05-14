package week_7.day_1;

public class ComparisonOperator {

    /*  Relational Operators:

     * 1. less than ( < ):
     * 2. greater than ( > ):
     * 3. less than and equal ( <= ):
     * 4. greater than and equal ( >= ):
     *
     * */

  /*  Imagine you're lining up books on a shelf based on their heights.

  You will need to compare the heights of these books to decide their positions:
  which book is taller, which one is shorter, and which ones are of equal height.


    Java-related explanation:

    Relational operators are used in Java to compare two values and establish a relationship between
    them:

    > (Greater Than): Checks if the value on the left is greater than the one on the right.
    < (Less Than): Checks if the value on the left is less than the one on the right.
    >= (Greater Than or Equal To): Checks if the value on the left is greater than or equal to the one on the right.
    <= (Less Than or Equal To): Checks if the value on the left is less than or equal to the one on the right.
*/

    public static void main(String[] args) {
        // > (Greater Than):
        // X > Y;
        System.out.println( 100 > 150 ); // No --> false
        System.out.println( 100 > 150 || 150 < 200 );
        System.out.println("Hello World");
        System.out.println( 50 > 20 );

        // < ( Less Than )
        // X < Y
        System.out.println( 100 < 150 ); //
        System.out.println( 100 < 150 || 150 < 200 && 10 < 0 ); //
        System.out.println("Hello World"); //
        System.out.println( 50 < 20 ); //

        // Greater than or Equal to >=
        System.out.println( 100 == 100 );
        System.out.println( 100 > 100 );
        System.out.println( 100 >= 100 );


        // Less than or Equal to <=
        System.out.println( 100 == 100 );
        System.out.println( 100 < 100 );
        System.out.println( 100 <= 100 );

        if ( 100 == 100 ) {

        } else if ( 100 < 100 ) {

        } else {

        }

        // Vs using less than or equal to
        if ( 100 <= 100 ) {

        } else {

        }

    }
}
