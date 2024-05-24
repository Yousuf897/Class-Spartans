package week_8.lab_session;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplyFiltersToString {

    static String message = "Welcome 01TO TekSchool Java IS EASY! 123*&^^%^%%!@#)_!@#@#)!(*@$)(*!asdljhasdjklh";

    // Get the characters only, Both UpperCase & LowerCase
    // Get the numbers only
    // Get the Symbols only or Special Characters
    // Get the LowerCase Characters only
    // Get the UpperCase Characters only

    public static void main(String[] args) {

        // GetBoth UpperCase & LowerCase Characters
        printUpperCaseAndLowerCaseCharacters(message);

        // Get the numbers only
        printNumbersOnlyFromString(message);

        // Get the Symbols only or Special Characters
        printSpecialCharacters(message);
        // How to reven remove the spaces as well
       // System.out.println( message.replaceAll("[a-zA-Z0-9]", "").replace(" ", "") );

        // Get the LowerCase Characters only
        printLowerCaseCharacters(message);

        // Get the UpperCase Characters only
        printUpperCaseCharacters(message);

        // Print LowerCase Characters using loop
        printLowerCaseCharactersUsingLoop(message);

        // Print UpperCase Characters using loop
        printUpperCaseCharactersUsingLoop(message);

        // Jump Into New Line!
        System.out.println();

        // Print LowerCase Characters using IntStream
        System.out.println( "Using IntStream " + printLowerCaseCharactersUsingIntStream( message ) );

        // Print UpperCase Characters using IntStream
        System.out.println( "Using IntStream " + printUpperCaseCharactersUsingIntStream( message ) );

        // Print numbers using IntStream
        System.out.println( "Using IntStream " + printNumbersCaseCharactersUsingIntStream(message) );

        // Print Count of LowerCase Characters in a String using IntStream
        System.out.println( " LowerCase Count:  " + printCountOfLowerCaseCharacters(message) );

        // Print Count of UpperCase Characters in a String using IntStream
        System.out.println( " UpperCase Count:  " + printCountOfUpperCaseCharacters(message) );

        // Print the count of digits using IntStream
        System.out.println( "Count digits: " + printCountOfDigitsCharacters(message) );

    }

    // Method to print UpperCase and LowerCase characters in a String
    public static void printUpperCaseAndLowerCaseCharacters( String str) {
        System.out.println( str.replaceAll("[^a-zA-Z]", "") );
    }

    // Method to print the numbers only in a String
    public static void printNumbersOnlyFromString( String str ) {
        System.out.println( str.replaceAll("[^0-9]", "") );
    }

    // Method to print Symbols only or Special Characters in a String
    public static void printSpecialCharacters( String str ) {
        System.out.println( str.replaceAll("[a-zA-Z0-9]", "") );
    }

    // Method to print LowerCase Characters only from a String
    public static void printLowerCaseCharacters( String str ) {
        System.out.println( str.replaceAll("[^a-z]", "") );
    }

    // Method to print UpperCase Characters only from a String
    public static void printUpperCaseCharacters( String str ) {
        System.out.println( str.replaceAll("[^A-Z]", "") );
    }

    // Method to print LowerCase Characters only from a String using for loop
    public static void printLowerCaseCharactersUsingLoop( String str ) {
        for ( int index = 0; index < str.length(); index++ ) {
            if ( Character.isLowerCase( str.charAt(index) ) ) {
                System.out.print( str.charAt(index) + " " );
            }
        }
    }

    // Method to print LowerCase Characters only from a String using for loop
    public static void printUpperCaseCharactersUsingLoop( String str ) {
        for ( int index = 0; index < str.length(); index++ ) {
            if ( Character.isUpperCase( str.charAt(index) ) ) {
                System.out.print( str.charAt(index) + " " );
            }
        }
    }

    // Method to print LowerCase Characters of a String using IntStream
    public static String printLowerCaseCharactersUsingIntStream( String str ) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i))
                .filter(Character::isLowerCase)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    // Method to print UpperCase Characters of a String using IntStream
    public static String printUpperCaseCharactersUsingIntStream( String str ) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i))
                .filter(Character::isUpperCase)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    // Method to print Numbers Characters of a String using IntStream
    public static String printNumbersCaseCharactersUsingIntStream( String str ) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i))
                .filter(Character::isDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    // Method to print Numbers LowerCase Characters of a String using IntStream
    public static long printCountOfLowerCaseCharacters( String str ) {
        return IntStream.range(0, str.length())
                .filter( i -> Character.isLowerCase( str.charAt(i) ))
                .count();
    }

    // Method to print Numbers UpperCase Characters of a String using IntStream
    public static long printCountOfUpperCaseCharacters( String str ) {
        return IntStream.range(0, str.length())
                .filter( i -> Character.isUpperCase( str.charAt(i) ))
                .count();
    }

    // Method to print Numbers of digits of a String using IntStream
    public static long printCountOfDigitsCharacters( String str ) {
        return IntStream.range(0, str.length())
                .filter( i -> Character.isDigit( str.charAt(i) ))
                .count();
    }

    // Loop to target from start and end at the same time!

}
