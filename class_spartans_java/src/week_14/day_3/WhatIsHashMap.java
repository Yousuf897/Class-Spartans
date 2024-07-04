package week_14.day_3;

public class WhatIsHashMap {

    // Student Names: Joe, Mike, Bob ....

    //  Key - Value --> Key value pairs

    // 01 -> John
    // 02 -> Mike
    // 03 -> Bob
    // 04 -> John

    /*
    *
    *
    * HashMap is one of the most widely used implementations of the Map interface in Java. It stores data
    *  in key-value pairs, and it allows you to
    * retrieve a value based on its associated key. HashMap works by using a hashing technique,
    * where the keys are processed by a hash function to produce
    * an index in an array, where the corresponding value will be stored.
    *
    * Characteristics of HashMap

    Unordered: The elements (key-value pairs) in a HashMap are not ordered. Neither by their key
    * nor by their value.

    Key Uniqueness: Each key in the HashMap must be unique. If you try to insert a key-value pair with
    * a key that's already in the map, the old value for that key will be replaced.

    Allows Null: HashMap allows one null key and multiple null values.


Initial Capacity and Load Factor: The HashMap has an initial capacity (default capacity is 16) and a
* load factor (default load factor is 0.75). When the number of entries in the hashmap exceeds the product
*  of the load factor and the current capacity, the hashmap is rehashed
* (i.e., internal data structures are rebuilt).

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Add key-value pairs to the HashMap
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        fruitPrices.put("Cherry", 70);
        System.out.println(fruitPrices); // {Apple=50, Banana=20, Cherry=70} (Order can vary)

        // Retrieve a value using its key
        int applePrice = fruitPrices.get("Apple");
        System.out.println("Price of Apple: " + applePrice); // Price of Apple: 50

        // Try adding a key-value pair with an existing key
        fruitPrices.put("Apple", 55);
        System.out.println(fruitPrices.get("Apple")); // 55

        // Check if a key exists
        boolean hasMango = fruitPrices.containsKey("Mango");
        System.out.println("Has Mango? " + hasMango); // Has Mango? false

        // Remove a key-value pair by key
        fruitPrices.remove("Banana");
        System.out.println(fruitPrices); // {Apple=55, Cherry=70} (Order can vary)
    }
}

Some useful methods which can be used by Map collections

    put(key, value): Adds a key-value pair to the map. If the key already exists, the previous value
    * associated with the key is replaced with the new value.

    get(key): Returns the value associated with the specified key. If the key is not present in the map,
    *  it returns null.

    containsKey(key): Checks if the map contains the specified key. Returns true if the key exists,
    * false otherwise.

    containsValue(value): Checks if the map contains the specified value. Returns true if the value exists,
    * false otherwise.

    remove(key): Removes the key-value pair associated with the specified key from the map.
    * If the key is not found, it does nothing.

    keySet(): Returns a set containing all the keys in the map.

    values(): Returns a collection containing all the values in the map.

    entrySet(): Returns a set containing all the key-value pairs (entries) in the map as Map.Entry objects.
    *
    *getKey(): will return the key associated with the entry
    *
    * getValue(: will return the value associated with the entry

    size(): Returns the number of key-value pairs in the map.

    isEmpty(): Checks if the map is empty. Returns true if the map has no key-value pairs, false otherwise.

    clear(): Removes all key-value pairs from the map, making it empty.
    *


    *
    * */

}
