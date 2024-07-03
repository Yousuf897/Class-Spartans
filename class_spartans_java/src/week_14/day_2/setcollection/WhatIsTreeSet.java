package week_14.day_2.setcollection;

public class WhatIsTreeSet {


    /*
    *
    * TreeSet is another Java class that implements the Set interface. Unlike HashSet and LinkedHashSet,
    * which are backed by hash tables, TreeSet is backed by a red-black tree
    * (a type of self-balancing binary search tree).
    *  As a result, the elements in a TreeSet are always in a sorted order.


Sorted: Elements in a TreeSet are sorted. This can be based on their natural ordering or
*  using a custom comparator.

No Duplicate Values: Like other Set implementations, TreeSet doesn't allow duplicate values.

Null Values: TreeSet does not allow null values. Adding null will throw a NullPointerException.

*
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a new TreeSet
        Set<String> fruits = new TreeSet<>();

        // Add elements to the TreeSet
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Banana");
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

        // Attempt to add a null value (will throw NullPointerException)
        // fruits.add(null);
    }
}

    * */

}
