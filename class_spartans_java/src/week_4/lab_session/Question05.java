package week_4.lab_session;

public class Question05 {

    /*
    * Question 05: Problem Statement:
    * Given the string "programming", write a Java program to extract and print the substring
    * starting from index 3 up to the end of the string.
    *
    *  Expected Output: gramming
    *
    * */

    public static void main(String[] args) {

        String str = "programming";
        System.out.println( str.substring(3) );

        String message = str.substring(3);
        System.out.println( message );

        str = str.substring(3);
        System.out.println( str );
    }

}
