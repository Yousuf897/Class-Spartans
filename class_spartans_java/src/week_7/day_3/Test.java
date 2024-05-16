package week_7.day_3;

public class Test {

    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println( numbers[1][2] );
        System.out.println( numbers[0][1] );

        int [][] numbersTwo = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                {3}
        };

        System.out.println(numbersTwo[1][0]);
        System.out.println( numbersTwo[0][6] );
        System.out.println( numbersTwo[0][ (numbersTwo[0].length / 2) - 1 ] );

        /*
        *
        * 22 33 44 55 66 77 88 89
         33 44 55 22 101  111 222
        102 222 321 344 21 33
        *
        * */

//        System.out.println( numbers[1][ numbers.length - 3 ] );



    }

}
