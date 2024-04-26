package week_4.lab_session;

public class Question02 {

    /*
    *
    * Question 02: Problem Statement:
    * Given the string "java", write a Java program that calculates the length of the string after
    * concatenating it with another string "script", making the final string "javascript".
    * Print the length of the new string.
    *
    *  Expected Output: 10
    *
    * */

    public static void main(String[] args) {

        // Data (Information)
        String str1 = "java";
        String str2 = "script";

        // First solution
        System.out.println( (str1 + str2).length() );


        // Second solution
        System.out.println( ("java" + "script").length() );


        // Third Solution
        System.out.println( str1.concat(str2).length() );


        // Fourth Solution
        int stringLength = (str1 + str2).length();
        System.out.println("Length of the message is: " + stringLength );

    }
}
