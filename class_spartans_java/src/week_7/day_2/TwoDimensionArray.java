package week_7.day_2;

public class TwoDimensionArray {

    public static void main(String[] args) {
        // Dynamic Initialization of 2D Array
        int[][] numbers = new int[2][2];

        // Max Row that I can Assign Value: 1 --> n - 1 --> 2 - 1 = 1
        // Max Col that I can Assign value: 1 --> n - 1 --> 2 - 1 = 1

        numbers[0][0] = 10;
        numbers[0][1] = 50;
        numbers[1][0] = 40;
        numbers[1][1] = 30;

        // Negative Test
//        numbers[2][0] = 50;
//        numbers[1][2] = 50;

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);

        System.out.println(numbers[2][0]);
        System.out.println( numbers[1][2] );


    }
}
