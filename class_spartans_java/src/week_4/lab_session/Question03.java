package week_4.lab_session;

public class Question03 {

    /*
    *  Question 03: Problem Statement:
    *  Create a Java program that reads a sentence "How many letters are in this sentence?"
    *  and determines the length of the sentence without counting spaces. Print the result to the console.
    *
    * Expected Output: 32
    *
    * */

    public static void main(String[] args) {

        int countCharacters = 0;

        // First Solution
        String str1 = "How many letters are in this sentence?";
        System.out.println( str1.length() );

        System.out.println( ( str1.replace(" ", "").length() ) );

        // Second Solution
        str1 =  str1.replace(" ", "");
        System.out.println( str1.length() );

        // Third Solution
        for (int index = 0; index < str1.length(); index++ ) {
            if ( str1.charAt(index) != ' ' ) {
                countCharacters++;
            }
        }
        System.out.println("Character length: " + countCharacters );
    }

}
