package week_8.day_3;

public class StaticScope {

    String firstName = "Bob";
    static String lastName = "John";

    /*
*       3. Class Scope (Static Scope):
	•	Static variables belong to the class itself, not to any specific instance (Object).
	•	They can be accessed using the class name or directly within static methods.
    * */

    public static void main(String[] args) {

        var staticScopeObj = new StaticScope();
        // System.out.println( firstName ); // Cannot be accessed because firstName is not static
        System.out.println( staticScopeObj.firstName ); // Now it can be accessed through the object.

        System.out.println( lastName ); // Now it can be accessed because it's static
        // and static members can be accessed without using of Objects.
        System.out.println( StaticScope.lastName );

    }

}
