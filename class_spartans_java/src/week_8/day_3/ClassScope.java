package week_8.day_3;

public class ClassScope {


    /*
    * 2. Class Scope (Instance Scope):
    •	Variables declared in a class, but outside of any method, are instance variables ( Class Scope ).
	•	They belong to an object (an instance of the class) and are accessible from any non-static
	    method within the class.
    * */

    String firstName = "Bob"; // Class Level Variable
    int number = 0; // Class Level Variable

    public static void main(String[] args) {

        // Inside a Static Method
        var classScope = new ClassScope(); // Object of the class to access their properties
       // System.out.print( firstName ); // Cannot be accessed directly without calling object
        System.out.print( classScope.firstName ); // firstName can be accessed through the object
    }

    public void printFirstName() {
        firstName = "Mathias";
        System.out.println( firstName ); // Can be accessible because it's a non-static method
    }

}
