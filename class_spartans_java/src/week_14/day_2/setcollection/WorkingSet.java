package week_14.day_2.setcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class WorkingSet {

    public static void main(String[] args) {

        // Array of integers
        int[] numbers = { 60, 50, 10, 0, 100, 99, 88, 10, 0, 1, 1, 0, 2 };

        // Creating three different sets to store integers
        HashSet<Integer> hashSetOfNumbers = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSetOfNumbers = new LinkedHashSet<>();
        TreeSet<Integer> treeSetOfNumbers = new TreeSet<>();

        // Adding elements from the array 'numbers' into each set
        for (int number : numbers) {
            hashSetOfNumbers.add(number);           // Adding to HashSet
            linkedHashSetOfNumbers.add(number);     // Adding to LinkedHashSet
            treeSetOfNumbers.add(number);           // Adding to TreeSet
        }

        // Printing the elements of all sets
        System.out.println("HashSet output: " + hashSetOfNumbers);
        System.out.println("LinkedHashSet output: " + linkedHashSetOfNumbers);
        System.out.println("TreeSet output: " + treeSetOfNumbers);

    }

}
