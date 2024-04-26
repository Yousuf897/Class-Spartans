package week_4.lab_session;

public class Question08 {

    /*
    *
    * Question 08: Problem Statement:
    * Given the string "Learning Java is fun", write a Java program to find and print the character
    * that appears exactly at the middle of the string. Assume the string length is odd.
    *
    * Expected Output: J
    *
    *
    *  */

    public static void main(String[] args) {

        String str = "Learning, Java is fun!";   // 21 / 2 = 10.5
        System.out.println( (double) str.length() / 2 );
        System.out.println(str.charAt((str.length() / 2)));
        int middleIndex = (str.length() / 2) - 1; // 10 - 1
        char middleCharacter = str.charAt(middleIndex);
        System.out.println( str.indexOf(",") );

        System.out.println( str.charAt(8) );

        System.out.println("Middle index is: " + middleIndex );
        System.out.println("Middle character is: " + middleCharacter );


        // Easy Solution
        System.out.println( str.charAt((str.length() / 2) - 1));


    }
}
