package week_7.day_3;

public class EnhancedForLoop {

    /*
     * for (DataType name of your iterator : TargetLocation  ) {
     *
     * }
     *       String name = "Bob"
     * */


    int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};

    public static void main(String[] args) {

        int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};
        String[] names = {"Bob", "John", "Doe", "Alex", "Sam"};
        // Using For Loop
        for ( int index = 0; index < numbers.length; index++ ) {
            System.out.print( numbers[index] + " " );
        }

        System.out.println();

        // Enhanced For Loop
        for ( int number : numbers  ) {
            System.out.print( number + " ");
        }

        System.out.println();

        for ( String name : names ) {
            System.out.print( name + " " );
        }
    }

}
