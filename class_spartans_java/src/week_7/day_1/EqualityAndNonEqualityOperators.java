package week_7.day_1;

public class EqualityAndNonEqualityOperators {

    /*
     *   In genral, we have two data types in java!
     *
     *  1. Primitive Data Types: byte, short, int, long, float, double, boolean, char
     *  2. Non-Primitive Data Types (Reference): String, array, object, class, interfaces
     *
     *      String name = "Bob";
     *      String lastName = "Alexander";
     *       System.out.println( name = lastName ); || =: Assignment operator,
     *      equals(); |  System.out.println( name.equals(lastName) );
     * */


/*
    Real-life analogy:

    Imagine you have two apples. You want to compare if they weigh the same or not.
    You place them on two sides of a balance scale. If they weigh the same,
    the scale remains balanced. If one apple is heavier, the scale will tip to one side.

    In Java, equality operators are used to compare two values:

    == (Equality): This operator checks if two values are equal. If they are, it returns true;
    otherwise, it returns false.

    != (Inequality): This operator checks if two values are not equal. If they are not equal,
    it returns true; otherwise, it returns false.


    It's crucial to note that for primitive types (int, char, double, etc.), these operators compare
    the actual values. But for objects, they compare memory locations (i.e., reference equality),
    not the actual content of the objects. For content equality with objects, one often uses methods like
    .equals().
*/

    public static void main(String[] args) {

        // Equality Operator ( == )
        int numberOne = 20;
        int numberTwo = 30;

        // No
        System.out.println( numberOne == numberTwo );
        //                  20     ==      30 ? ==> false

        System.out.println( numberOne != numberTwo );
        //                  20     not equal      30 ? ==> Yes , ==> true

        // equals(): return true or false'
        System.out.println( "Bob".equals("Tony") );

    }

}
