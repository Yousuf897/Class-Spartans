package week_14.day_2.setcollection;

import java.util.TreeSet;

public class SortNumbers {

    public static void main(String[] args) {

        // Array of integers
        int[] numbers = { 10, 5, 3, 4, 5, 0, 1, 1, 2, 3, 4, 5 };

        // Creating a TreeSet to store integers (automatically sorts elements)
        TreeSet<Integer> setOfNumbers = new TreeSet<>();

        // Adding elements from the array 'numbers' into the TreeSet
        for (int number : numbers) {
            setOfNumbers.add(number);   // TreeSet automatically sorts and removes duplicates
        }

        // Printing the TreeSet (sorted and unique elements)
        System.out.println(setOfNumbers);

        // Separator line
        System.out.println(" * * * * * * ");

        // Array of characters
        char[] charArray = {'q', 'z', 'k', 'b', 'w', 'f', 'y', 'm', 'd', 'e'};

        // Creating a TreeSet to store characters (automatically sorts elements)
        TreeSet<Character> setOfCharacters = new TreeSet<>();

        // Adding elements from the charArray into the TreeSet
        for (char character : charArray) {
            setOfCharacters.add(character); // TreeSet automatically sorts and removes duplicates
        }

        // Printing the TreeSet (sorted and unique characters)
        System.out.println(setOfCharacters);

        // Trying to add a null element (TreeSet does not allow null elements)
        // setOfCharacters.add(null); // Uncommenting this line would cause a NullPointerException

        // Adding another element 'b' to the TreeSet
        setOfCharacters.add('b');

        // Printing the TreeSet after adding 'b'
        System.out.println(setOfCharacters);

        // Array of strings
        String[] names = { "Mathias", "Mathias", "Tony", "Erin" };

        // Creating a TreeSet to store strings (automatically sorts elements)
        TreeSet<String> setOfNames = new TreeSet<>();

        // Adding elements from the names array into the TreeSet
        for (String name : names) {
            setOfNames.add(name);   // TreeSet automatically sorts and removes duplicates
        }

        // Printing the TreeSet (sorted and unique names)
        System.out.println(setOfNames);

    }

}
