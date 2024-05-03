package week_5.lab_session;

public class FindMaximumNumberBetweenThree {

    // Write a program to find the maximum of three numbers using conditional statements.

    public static void main(String[] args) {

        int a = 160;
        int b = 160;
        int c = 160;

        // Find the maximum number out of three numbers
        if ( a > b && a > c ) {
            System.out.println("Maximum number is: " + a);
        } else if ( b > a && b > c ) {
            System.out.println("Maximum number is: " + b);
        } else if ( c > a && c > b ) {
            System.out.println("Maximum number is: " + c);
        } else {
            System.out.println("They're equal!");
        }

    }

}
