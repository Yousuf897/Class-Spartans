package week_14.day_3.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> mapOfNames = new LinkedHashMap<>();
        HashMap<Integer, String> hashMapOfNames = new HashMap<>();
        TreeMap<Integer, String> treeMapOfNames = new TreeMap<>();

        // add entries to hash map
        hashMapOfNames.put(1, "Bob");
        hashMapOfNames.put(4, "Eva");
        hashMapOfNames.put(5, "Tony");
        hashMapOfNames.put(2, "Eric");
        hashMapOfNames.put(3, "Trevor");

        // add entries to linked hashmap
        mapOfNames.put(1, "Bob");
        mapOfNames.put(4, "Eva");
        mapOfNames.put(5, "Tony");
        mapOfNames.put(2, "Eric");
        mapOfNames.put(3, "Trevor");

        // add entries to linked treeMap
        treeMapOfNames.put(1, "Bob");
        treeMapOfNames.put(4, "Eva");
        treeMapOfNames.put(5, "Tony");
        treeMapOfNames.put(2, "Eric");
        treeMapOfNames.put(3, "Trevor");

        // print the entries of HashMap
        System.out.println( hashMapOfNames );
        // print the entries of linkedHashMap
        System.out.println( mapOfNames );
        // print the entries of treemap
        System.out.println( treeMapOfNames );

    }


}
