package week_14.day_3.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleOne {

    public static void main(String[] args) {

        // Object of HashMap
        HashMap<Integer, String> myMap = new HashMap<>();
            // 1 John
//        Map<Integer, String> myMapTwo = new HashMap<>();
//        var myMapThree = new HashMap<Integer, String>();

        // How to add entries to map
        // put()
        myMap.put( 1, "Mathias" );
        myMap.put( 2, "Safiullah" ); // --> Tony
        myMap.put( 3, "Eric" );
        myMap.put( 4, "Bob" );

        // How to print the entries of the map
        System.out.println( myMap );

        // How to retrieve information or entry from map
        System.out.println( myMap.get(1) ); // Mathias

        // If the doesn't exist, it will return null
        System.out.println( myMap.get(10) );

        // How to replace the value or update the value in map
        myMap.put(2, "Tony");

        // Print the updated my
        System.out.println( myMap );

        myMap.put(20, "Bob");

        System.out.println( myMap );

        // How to check if specific value exist in my map
        System.out.println(  myMap.containsKey(20) );
        System.out.println(  myMap.containsKey(15) );

        // How to check the entry based on the value
        System.out.println( myMap.containsValue("Tony") );
        System.out.println( myMap.containsValue("Safiullah") );

        // How to remove an entry from map
        System.out.println( myMap.remove(1) );

        System.out.println( myMap );

        myMap.put(1, "Mathias");

        System.out.println( myMap );

        myMap.put(1, "Bob");

        System.out.println( myMap );

        // How to remove an entry from the map by using key and value
        myMap.remove(1, "Bob");

        System.out.println( myMap );

        // Retrieve all the keys stored in the map
        System.out.println( myMap.keySet() );

        // Retrieve all the values stored in the map
        System.out.println( myMap.values() );

        // How to Retrieve all keys and values at the same time
        System.out.println( myMap.entrySet() );


        // Loop through all entries of map
        for ( Map.Entry<Integer, String> entry : myMap.entrySet() ) {
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }

        // How to loop through the keys of the map
        for ( int entry : myMap.keySet() ) {
            System.out.println( entry );
        }

        // Loop through the values of map
        for ( String entry : myMap.values() ) {
            System.out.println( entry );
        }

         myMap.forEach( ( key, value ) -> System.out.println(" key: " + key + " value: " + value ) );
         myMap.forEach( ( key, value ) -> System.out.println(key + " => " + value ) );

         // myMap.forEach( myMap.keySet()   -> System.out.println( "Key: " + key ) );


    }

}
