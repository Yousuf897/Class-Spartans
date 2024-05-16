package week_7.day_3;

public class EnhancedForLoopExampleTwo {

    public static void main(String[] args) {

        int countEven = 0;
        int countOdd = 0;
        int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};

        // Find and Print even numbers from array of numbers
        // int is the data type of values
        // number is the name of iterator ( Can be anything )
        // conditional, separates the iterator and target location
        // numbers is the name of the target location in which iterator needs to grab the values from.
        System.out.print("Even Numbers: ");
        for ( int number : numbers ) {
            if (number % 2 == 0 ) {System.out.print(number + " "); countEven++;}
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for ( int number : numbers ) {
            if (number % 2 != 0 ) {System.out.print(number + " "); countOdd++;}
        }

        System.out.println();
        System.out.println("We have found " + countEven + " even numbers!");
        System.out.println("We have found " + countOdd + " odd numbers!");




    }

}
