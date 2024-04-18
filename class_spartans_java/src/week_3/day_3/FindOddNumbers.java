package week_3.day_3;

public class FindOddNumbers {

    public static void main(String[] args) {
        int countOdd = 0;
        int[] numbers = { 10, 2, 1, 0, 100, 954, 933, 4, 3, 3, 1, 5 };

        // Fid Odd numbers

        for ( int eachNumber : numbers ) {
            if (eachNumber % 2 != 0) {
                countOdd++;
                System.out.print(eachNumber + ", ");
            }
        }
        System.out.println();
        System.out.println("I have found " + countOdd + " odd numbers. ");
    }

}
