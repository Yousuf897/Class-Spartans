package week_13.day_1;

public class Polymorphism {

    /*
    Polymorphism is one of the four fundamental concepts of Object-Oriented Programming (OOP).
    The word "polymorphism" comes from the Greek words "poly" (meaning many) and "morph" (meaning forms).
    In the context of OOP, polymorphism allows objects to be treated as if they are objects of another type.

    Real-life analogy:

    Imagine a universal remote control designed to work with several types of electronic devices like TVs,
    DVD players, and audio systems. Even though each device functions differently and has unique features,
    the remote can control all of them. You press the "power" button,
     and the appropriate device turns on or off. In this analogy, the universal remote
    demonstrates polymorphism. It can control many types of devices, treating them all as
    if they were the same.

    Explanation in Programming:

    In Java, polymorphism primarily manifests in two forms:

    Compile-time Polymorphism (Method Overloading):

    This occurs when two or more methods in the same class have the same name but different parameters.
    The method called is determined at compile time based on the method signature.


    Example:

    class MathUtility {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    Runtime Polymorphism (Method Overriding via Inheritance):

    This is when a subclass provides a specific implementation for a method that is already defined
    in its superclass. At runtime, the JVM determines which method to invoke based on the object being
    referred to. It's essential to have the @Override annotation above the method in the subclass,
    and the superclass method cannot be final, static, or private.

    Example:

    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    Polymorphism, in essence, offers flexibility and allows for extensibility.
     It permits us to create one interface (like our universal remote) and have multiple implementations.
*/

}
