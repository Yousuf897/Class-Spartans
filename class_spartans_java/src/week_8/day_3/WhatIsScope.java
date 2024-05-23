package week_8.day_3;

public class WhatIsScope {

     /*
    In programming, scope refers to the region of the code where a particular variable, function, or
    object is accessible.
     It determines the visibility and lifetime of variables and parameters, as well as functions and
     classes in certain languages.
     Understanding scope is crucial because it dictates how software entities interact
     and it helps avoid potential naming conflicts and bugs.
 */

/*
    Different Scopes in Java:

    1. Local Scope (Method/Block Scope):
    •	Variables declared within a method or block are local to that method or block.
    •	They cannot be accessed outside of that method or block.
    •	Their lifetime starts when the method or block is entered and ends when it exits.

   void main() {
        int localVariable = 10;  // This variable is local to someMethod

       if (true) {
            int anotherLocal = 5;  // This variable is local to this if-block
        }

        // anotherLocal is not accessible here
    }

// localVariable is not accessible here


2. Class Scope (Instance Scope):
    •	Variables declared in a class, but outside of any method, are instance variables ( Class Scope ).
	•	They belong to an object (an instance of the class) and are accessible from any non-static
	    method within the class.

    public class MyClass {
        int instanceVariable;  // This variable has class (or instance) scope

        void someMethod() {
            instanceVariable = 10;  // Accessible here
        }
    }

    3. Class Scope (Static Scope):
	•	Static variables belong to the class itself, not to any specific instance.
	•	They can be accessed using the class name or directly within static methods.

public class MyClass {

    static int staticVariable;  // This is a static variable with class scope

    static void someStaticMethod() {
        staticVariable = 10;  // Accessible here
    }
}

 Package Scope:
	•	If a class, variable, or method has no access modifier (like public, private, or protected),
	    it's said to have package scope in Java.
	•	It can be accessed from any other class in the same package.

5. Global Scope:
	•	In some languages (not Java), variables can be defined to be global for an entire program or module.
	Java does not have a global scope in the way some languages like C or Python might.
	•	In Java, the closest concept is a public static variable, which can be accessed
	from other classes and packages if the class is also public.

*/

    public static void main(String[] args) {
        // SCOPE
        int number = 10; // Local Variable
        System.out.println( number );
    }


}
