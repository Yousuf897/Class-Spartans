package week_14.day_1.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {

    public static void main(String[] args) {

        String[] names = { "Tony", "Alex", "Mark" };
        List<String> listOfNames = new ArrayList<>();

        System.out.println( "The size of array is: " + names.length );


        // Add some elements to array list
        listOfNames.add("John");
        listOfNames.add("Mathias");
        listOfNames.add("Fazli");

        System.out.println( "The size of array is: " + listOfNames.size() );


    }

}
