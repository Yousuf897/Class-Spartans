package week_1.day_3;

public class TypesOfVariable {

    String lastName;
    static String dateOfBirth;
    static String firstName = "John";
    static int number = 10;

    /*
    *     Types of Variables

    1. Local Variables: These are like boxes you only use in one room
    * (within a method) and aren't available elsewhere.


    2. Instance Variables: Imagine a box that belongs to the entire
    *  house and can be accessed from  any room. These variables belong to
    * an object and are available to all methods within the same
    class, as long as they are called on the same object.



    3. Class Variables: Also known as static variables, these are like community
    * boxes that are shared among all instances (objects) of a class.
    * */

    public static void main(String[] args) { // Main Method Block
        var obj = new TypesOfVariable();

       // Local Variable
        System.out.println( number );

        System.out.println( firstName );
        System.out.println( obj.lastName );
        System.out.println( dateOfBirth );

    } // End Main Method Block

    public static void printNumber() {
        var obj = new TypesOfVariable();
        // Local Variable
        System.out.println( number );
        System.out.println( firstName );
        System.out.println( obj.lastName );
        System.out.println( dateOfBirth );
    }

}
