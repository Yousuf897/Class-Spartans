package week_4.lab_session;

public class Question09 {

    /*
    *
    *   Question 9: Problem Statement:
    *   Write a Java program to replace all occurrences of 'a' with '@' in the string "Java Basics".
    *
    *    Expected Output: J@v@ B@sics
    *
    * */

    public static void main(String[] args) {

        String str = "Java Basics";
        System.out.println( str.replace('a', '@') );

        str = str.replace('a', '@');
        System.out.println( str );
    }

}
