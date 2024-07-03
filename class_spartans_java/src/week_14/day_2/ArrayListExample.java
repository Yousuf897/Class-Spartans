package week_14.day_2;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        // add value to arrayList
        listOfNames.add("John"); // 0 --> John
        listOfNames.add("Alex");
        listOfNames.add("Bob");

        // add values to list of numbers
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);

        // Print the elements of an arrayList
        System.out.println( listOfNames );

        // Remove the first value of the arrayList
        System.out.println( listOfNames.remove("John") );
        System.out.println( listOfNames.remove("Tony") );

        System.out.println( listOfNames );

        listOfNames.add("Bob");
        listOfNames.add("Alex");

        System.out.println(  );

        // Print elements of an integer data type
        System.out.println( listOfNumbers );





    }

}
