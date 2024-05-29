package week_9.day_1;

public class MethodExampleTwo {

    public static void main(String[] args) {

        // Built-In Methods
        String fullName = "John Doe";
        System.out.println( fullName.toUpperCase() ); // toUpperCase() is a built-in method!
        System.out.println( fullName.length() ); // length() returns the length of the string!

        // Can I call my own method?
        // yes!
        printMessage();
       // printFullName(); // It's not static, and you cannot access it directly.
        // You can access  this method by creating an object, and then access it.

    }

    // User Defined Methods ( custom methods )
    // Create a method that is going to print "Hello World" into the console!
    // Call this method and get the output!
    public static void printMessage() {
        System.out.println( "Hello World" );
     }

     public void printFullName() {
         System.out.println( "John Doe" );
     }

}
