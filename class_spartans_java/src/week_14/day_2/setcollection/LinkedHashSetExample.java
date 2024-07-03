package week_14.day_2.setcollection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // Create an object of LinkedHashSet to store strings
        LinkedHashSet<String> setOfNames = new LinkedHashSet<>();

        // Add elements to LinkedHashSet
        setOfNames.add("Tony");
        setOfNames.add("Bob");
        setOfNames.add("Ivan");
        setOfNames.add("Erin");

        // Print the elements of the set (order is maintained)
        System.out.println(setOfNames);

        // Remove an element from LinkedHashSet
        setOfNames.remove("Ivan");

        // Print the elements after removal
        System.out.println(setOfNames);

        // Note: There are no methods like removeFirst() or removeLast() in LinkedHashSet

        // Adding elements at the beginning of LinkedHashSet is not supported directly

        // Print the elements after adding elements at the beginning
        System.out.println(setOfNames);

        // Check if the set is empty
        System.out.println("Is set empty: " + setOfNames.isEmpty());

        // Clear all elements from the set
        setOfNames.clear();

        // Print the set after clearing (should be empty)
        System.out.println(setOfNames);
    }
}
