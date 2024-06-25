package week_13.day_1.abstraction;

public abstract class WhatIsAbstractMethod {


    /*
     * An abstract method is a method that is declared without an implementation
     * (without braces, and followed by a semicolon), like this: In order to use an abstract method,
     * you need to override that method in sub class.
     *
     * */

    // How to create abstract method
    public abstract void makeSound();

    public void printMessage() {
        System.out.println("Welcome to TekSchool");
    }

}
