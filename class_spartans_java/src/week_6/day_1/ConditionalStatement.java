package week_6.day_1;

public class ConditionalStatement {

    public static void main(String[] args) {

        // Find the maximum number out of two numbers using conditional statement
        int numberOne = 100;
        int numberTwo = 1;
        int maximumNumber;


        // Find the max number between numberOne and numberTwo

        maximumNumber = ( numberOne < numberTwo ) ? numberTwo : numberOne;

        // Or you can directly print the maximum number
        System.out.println(( numberOne < numberTwo ) ? numberTwo : numberOne);

        // or print a message along with the max value
        System.out.println("The maximum value out of "+ numberOne + " and " + numberTwo + " is = " + maximumNumber);


    }

}
