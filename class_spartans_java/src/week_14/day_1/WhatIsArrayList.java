package week_14.day_1;

public class WhatIsArrayList {

     /*
    *
    * In Java, ArrayList is one of the most widely used classes from the Collections framework.
    * It provides a dynamic array, which means you can add or remove
    *  items from it after it's been created.


    Dynamic Sizing: Unlike a traditional array, an ArrayList automatically resizes itself when you add or
    * remove elements.
    *
    Implements List Interface: ArrayList implements the List interface, so it's ordered and elements
    * can be accessed by their index position.
    *
    Allows Duplicates: You can store duplicate values in an ArrayList.
    *
    Allows null: ArrayList can have null values.
    *
    Initial Capacity: When created, an ArrayList has an initial capacity. If the elements exceed this
    *  capacity, the array is resized (typically it's doubled).
    *
    Iterable: ArrayList implements the Iterable interface, so you can iterate over its elements
    * using enhanced for-loops or iterators.

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing an element by index
        System.out.println(fruits.get(1)); // Outputs: Banana

        // Removing an element
        fruits.remove(1); // Removes Banana

        // Iterating over elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


(old capacity * 3) / 2 + 1
    *
    * */

}
