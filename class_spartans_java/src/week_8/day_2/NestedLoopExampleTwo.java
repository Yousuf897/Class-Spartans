package week_8.day_2;

public class NestedLoopExampleTwo {

    public static void main(String[] args) {

        /*
        * reviser the the number 45678 with while loop and explain the logic? interview quation!
        *
        * */

        String number = "45678";
        String reversedNumbers = "";

        for ( int index = number.length() - 1; index >= 0; index-- ) {
            reversedNumbers += number.charAt(index);
        }
        System.out.println( reversedNumbers );

        int[] arrayOfNumbers = {4,5,6,7,8};

        for (int index = arrayOfNumbers.length - 1; index >= 0; index-- ) {
            System.out.print(arrayOfNumbers[index]);
        }

        System.out.println();

        int index = arrayOfNumbers.length - 1;
        while ( index >= 0 ) {System.out.print(arrayOfNumbers[index]); index--;}

        System.out.println();

        int num = 45678;
        String stringNum = number + "";
//        System.out.println( stringNum ); // Original value will be printed 45678

        int indexOfStringNum = stringNum.length() - 1;
        while ( indexOfStringNum >= 0 ) {
            System.out.print(stringNum.charAt(indexOfStringNum));
            indexOfStringNum--;
        }

    }

}
