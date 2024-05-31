package week_9.lab_session;

public class ReviewMethods {

    // Methods
    // user Defined Methods
    // Built-In Methods

    public static void main(String[] args) {

        // Built-In Methods
        String firstName = "John";
        System.out.println( firstName.toUpperCase() );
        System.out.println( firstName.toLowerCase() );
        System.out.println( firstName.replace("John", "John Doe" ) );
        System.out.println( firstName.length() );
        System.out.println( firstName.substring(0) );
        System.out.println( firstName.substring(2) );
        int number = 5;
        int[] listOfNumbers = { 1,2,3,4,5,6,7,8,9,10 };
        // Primitive Data Type
        System.out.println( listOfNumbers.length );

        printMessage();
        printFullName(" John Doe ");
        printFullName(" Erin Alexander ");
        printFullName(" John Morphy ");

        int result = sumOfTwoNumbers(10, 20); // 150
        System.out.println( result );
        System.out.println( sumOfTwoNumbers(10,20) );
        System.out.println( sumOfTwoNumbers(50, 100) ); // 150 --> int
        System.out.println( sumOfTwoNumbers(250, 150) + sumOfTwoNumbers(5, 3));
        System.out.println( sumOfTwoNumbers(250, 150) + 96);

    }

    // User Defined Methods
    // Access Modifier (optional) --> Default Access Modifier
    // Return Type int, String, long, boolean --> void
    // nameOfMethod
    // ()
    // {}
    // Body of your method

    // Method to print a message!
    public static void printMessage() {
        System.out.println( "Welcome to TekSchool!" );
    }

    // Arguments, non-arguments
    // Create a method which is going to print a fullName, and the name should be different everytime.
    // Method to print fullName along with a String
    public static void printFullName( String fullName ) {
        System.out.println("Full Name: " + fullName);
    }

    // Method to return the sum of two numbers
    public static int sumOfTwoNumbers( int numberOne, int numberTwo ) {
        return numberOne + numberTwo;
    }

}


