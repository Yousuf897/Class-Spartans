package week_13.day_2.statickeyword;

public class WhatIsStaticKeyword {

    /*

    Real-life Analogy:

    Imagine a shared toolbox in a workshop. Regardless of how many workers come and go in that workshop,
    there's only one toolbox that everyone uses. Whether there are 10 workers or 100 workers,
    the toolbox remains singular and shared among all. It's not personal to any worker;
    it belongs to the workshop as a whole.

    Programming Explanation:

    In Java, the static keyword is used primarily with variables, methods, and nested classes to indicate
    that they belong to the class itself rather than any specific instance (object) of the class.

    Static Variables: These are also known as class variables. They are initialized only once,
    at the start of the execution. Regardless of how many objects (instances) of a class are created,
    there's only one copy of the static variable. All instances of
    the class share this single copy.

    class Workshop {
        static int toolboxCount = 1;
    }


2. Static Methods: These methods belong to the class rather than any specific instance (object).
 They can only access static data; they cannot access non-static data or call non-static methods directly.
 Since they belong to the class, static methods can be called without creating an instance of the class.

    class MathUtils {
        static int add(int a, int b) {
            return a + b;
        }
    }
// Usage: MathUtils.add(5, 3); No need to create an instance.


3. Static Nested Class: This is a nested class that is static. It can access static members of the outer
class but cannot access non-static members.

   class OuterClass {
        static int data = 100;

        static class NestedStaticClass {
            void display() {
                System.out.println("Data from outer class: " + data);
            }
        }
    }

    Benefits:

    Memory Efficiency: Since there's only one copy of static variables regardless of the number of instances,
    they can be more memory efficient when used correctly.

    Utility Functions: Static methods, often used for utility functions (like the Math class), can be called
    without instantiating the class.

*/


}
