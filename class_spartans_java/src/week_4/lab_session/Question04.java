package week_4.lab_session;

public class Question04 {

    /*
    *  Question 04: Problem Statement:
    *  Write a Java program that extracts the word "Java" from the string "Hello Java World".
    *  Print the extracted substring to the console.
    *
    * Expected Output: Java
    *
    *
    * */

    public static void main(String[] args) {

        String str1 = "Hello Java World";
        System.out.println("Start from: " + str1.indexOf("Java") );
        System.out.println("End at: " + (str1.indexOf("World") - 1) );
        System.out.println("End at: " + (str1.indexOf("Java") + 4 ) );

        System.out.println( str1.substring(6,10) );
    }
}
