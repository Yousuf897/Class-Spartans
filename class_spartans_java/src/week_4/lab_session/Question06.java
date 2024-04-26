package week_4.lab_session;

public class Question06 {

    /*
    *
    * Question 06: Problem Statement:
    * Create a Java program to extract the word "boot" from the string "bootcamp" using the substring() method,
    * specifying both the start and end indexes.
    * Print the result to the console.
    *
    *  Expected Output: boot
    *
    * */

    public static void main(String[] args) {

        String str = "bootcamp";
        // Expected Output: boot

        System.out.println( str.substring(0, 4) );
        System.out.println( str.substring(0, str.indexOf("boot") + 4) ); // 0 + 4  = 4

    }

}
