package week_14.day_2.setcollection;

public class WhatIsLinkedHashSet {

     /*
    *
    * LinkedHashSet is a subclass of HashSet that also implements the Set interface. What makes LinkedHashSet
    * distinct from HashSet is that it maintains the order in which elements are inserted into the
    * set (insertion order). Internally,  it combines the hash table structure from HashSet with a
    * linked list to maintain this order.


Key Characteristics of LinkedHashSet:

    No Duplicate Values: Like HashSet, LinkedHashSet doesn't allow duplicate values.

    Ordered: Unlike HashSet, which is unordered, LinkedHashSet maintains the order of elements based on
    * their insertion. So the iteration order is predictable.

    Null Values: LinkedHashSet allows one null value.

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a new LinkedHashSet
        Set<String> fruits = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits); // [Apple, Banana, Cherry]

        // Try adding a duplicate element
        boolean isAdded = fruits.add("Apple");
        System.out.println(isAdded); // false

        // Check if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println(containsApple); // true

        // Remove an element
        fruits.remove("Banana");
        System.out.println(fruits); // [Apple, Cherry]
    }
}

    *
    * */

}
