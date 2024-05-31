package week_9.day_2;

public class Calculator {

    public void printMessage() {
        System.out.println( "Welcome to Java class, where students are all sleepy!" );
    }

    public int sumOfTwoNumbers( int numOne, int numTwo ) {
        return numOne + numTwo;
    }

    public void printSumOfTwoNumbers( int numOne, int numTwo) {
        System.out.println( " The result of " + numOne + " + " + numTwo + " = " + sumOfTwoNumbers(numOne, numTwo) );
        System.out.println( " The result of " + numOne + " + " + numTwo + " = " + (  numOne + numTwo ) );
    }

}
