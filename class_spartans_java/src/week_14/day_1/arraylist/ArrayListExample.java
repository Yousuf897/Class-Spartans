package week_14.day_1.arraylist;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        String[] names = new String[2]; // Declaration and initialization of array

        // Declare and initialize an arrayList

        ArrayList<String> listOfNames = new ArrayList<>();
        List<String> listOfVehicleNames = new Vector<>();
        var listOfNumbers =  new ArrayList<Integer>();
        var listOfBooleans =  new ArrayList<Boolean>();
        // ArrayList<Booleans> listOfBooleans = new ArrayList<>();


        // How to add elements to ArrayList
        // add();
        listOfNames.add("Alex");
        listOfNames.add("John");
        listOfNames.add("Tony");
        listOfNames.add("Mathias");

        // How to print or access the elements of array list
        System.out.println( listOfNames );
        System.out.println(  "Value stored at index number 0: " + listOfNames.get(0) );
        System.out.println(  "Last value stored in array list: " + listOfNames.getLast() );
        System.out.println(  "First value stored in array list: " + listOfNames.getFirst() );

        // Eva
        listOfNames.add(1, "Eva");
        System.out.println( listOfNames.get(1) );

        System.out.println( listOfNames );

        // How to remove element from arrayList
        listOfNames.remove("Eva");
        System.out.println( listOfNames );

        listOfNames.remove(1);
        System.out.println(listOfNames);

        // remove first value
        listOfNames.removeFirst();
        listOfNames.removeLast();
        // listOfNames.remove(listOfNames.size() - 1 );
        System.out.println( listOfNames );

        // Access all elements of array list
        for ( String name : listOfNames ) {
            System.out.print( name + " ");
        }


        System.out.println( " * * * * * * * *  * * * * * * * * * * * * * * * * * * * * * * * * " );

        for ( int i = 1; i <= 6; i++ ) {
            listOfBooleans.add(true);
            System.out.println( listOfBooleans );
        }

    }

}
