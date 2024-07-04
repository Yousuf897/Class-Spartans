package week_14.day_3.maps;

public class WhatIsTreeMap {

     /*
    * TreeMap is an implementation of the NavigableMap interface in Java, which in turn extends the
    *  SortedMap interface.
    *  It stores its elements in key-value pairs similar to other maps. However, the primary
    * distinction is that a TreeMap
    * is sorted according to the natural ordering of its keys or by a comparator provided at
    * map creation time.

    Sorted: The map is sorted according to the natural ordering of its keys or by a comparator
    * provided during its creation.
    * This ensures ordered key-value pairs when iterating.

    Key Uniqueness: Like other map implementations, each key in a TreeMap must be unique.

    Doesn't Allow Null: Unlike HashMap and LinkedHashMap, TreeMap doesn't allow null keys. However,
    * it does allow multiple null values.
    * If you attempt to add a null key, it will throw a NullPointerException.

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap
        Map<String, Integer> fruitPrices = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        fruitPrices.put("Cherry", 70);
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        System.out.println(fruitPrices); // {Apple=50, Banana=20, Cherry=70} (sorted by key)

        // Retrieve a value using its key
        int applePrice = fruitPrices.get("Apple");
        System.out.println("Price of Apple: " + applePrice); // Price of Apple: 50

        // Get the first (lowest) key
        String firstKey = ((TreeMap<String, Integer>) fruitPrices).firstKey();
        System.out.println("First key: " + firstKey); // First key: Apple

        // Remove a key-value pair by key
        fruitPrices.remove("Banana");
        System.out.println(fruitPrices); // {Apple=50, Cherry=70}
    }
}

    *
    * */

}
