package week_14.day_3.maps;

public class WhatIsLinkedHashMap {


    /*
    *
    * LinkedHashMap is a subclass of HashMap and also implements the Map interface. It maintains a
    * doubly-linked list running through all of its entries,
    * which ensures the order of the key-value pairs. This order can either be the order in which keys
    * were inserted into the map (insertion order)
    * or the order in which keys were last accessed, from least-recently accessed to most-recently
    * (access order).

    Key Characteristics of LinkedHashMap:

    Ordered: Unlike HashMap, which is unordered, LinkedHashMap maintains the order of key-value pairs.
    * By default, it's the order in which they were
    * inserted into the map (insertion order). However, if you use the constructor with the boolean
    *  argument set to true, it will be in access order.

    Key Uniqueness: Just like HashMap, each key in the LinkedHashMap must be unique.

    Allows Null: LinkedHashMap allows one null key and multiple null values.


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a new LinkedHashMap
        Map<String, Integer> fruitPrices = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        fruitPrices.put("Cherry", 70);
        System.out.println(fruitPrices); // {Apple=50, Banana=20, Cherry=70}

        // Retrieve a value using its key
        int applePrice = fruitPrices.get("Apple");
        System.out.println("Price of Apple: " + applePrice); // Price of Apple: 50

        // Modify the order by accessing an element (when using access order)
        // Note: For this example, we're using insertion order, so accessing won't change the order.
        fruitPrices.get("Banana");
        System.out.println(fruitPrices); // {Apple=50, Banana=20, Cherry=70}

        // Remove a key-value pair by key
        fruitPrices.remove("Banana");
        System.out.println(fruitPrices); // {Apple=50, Cherry=70}
    }
}

    * */

}
