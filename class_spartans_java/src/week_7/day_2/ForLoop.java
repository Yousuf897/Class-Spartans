package week_7.day_2;

public class ForLoop {

    /*
    * for ( initialization; condition; iteration ) {
    *   // Body of loop
    * }
    * */

    public static void main(String[] args) {

        // print the numbers from 1 to 10

        for ( int number = 1; number <= 11; number++ ) {
            if ( number == 10 ) {
                System.out.println(number);
            } else {
                System.out.print(number + ", ");
            }
            // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }

    }
}

