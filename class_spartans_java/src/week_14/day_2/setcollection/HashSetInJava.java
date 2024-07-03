package week_14.day_2.setcollection;

import java.util.HashSet;

public class HashSetInJava {

    public static void main(String[] args) {

        HashSet<String> setOfNames = new HashSet<>();

        // How to add elements to set
        setOfNames.add("Mathias");
        setOfNames.add("Elena");
        setOfNames.add("Tony");

        // Print the elements of Set
        System.out.println( setOfNames );

        // Le'ts add duplicate value
        System.out.println( setOfNames.add("Tony") ) ; // false

        System.out.println( setOfNames );

        // how to add null value
        setOfNames.add(null);

        System.out.println( setOfNames );

        // How to remove values from set
        setOfNames.remove("Tony");

        System.out.println( setOfNames );

        setOfNames.clear();

        System.out.println( setOfNames );

        // How to print the size of the set
        System.out.println( "Size of the set: " + setOfNames.size() );

        // Check if the set is empty or not
        System.out.println("Is my set empty? " + setOfNames.isEmpty() );

        // add 10 names to set
        for ( int i = 1; i <= 10; i++ ) {
            setOfNames.add("Mathias");
        }

        System.out.println( setOfNames );


    }


    /*
    * HashSet is one of the most commonly used classes that implements the Set interface. It uses a hash table
    * to store elements, which enables constant-time
    * performance for basic operations, assuming the hash function disperses elements properly among the
    *
    * buckets.

    Key Characteristics of HashSet:

    No Duplicate Values: If you try to add a duplicate value, the HashSet will not store the duplicate
    * and the add method will return false.

    Unordered: The order of elements in a HashSet is not guaranteed. It might change over time.

    Null Values: HashSet allows one null value.

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits); // [Banana, Cherry, Apple] (Order can vary)

        // Try adding a duplicate element
        boolean isAdded = fruits.add("Apple");
        System.out.println(isAdded); // false

        // Check if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println(containsApple); // true

        // Remove an element
        fruits.remove("Banana");
        System.out.println(fruits); // [Cherry, Apple] (Order can vary)
    }
}

    *
    * */

}
