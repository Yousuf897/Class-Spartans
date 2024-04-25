package week_4.day_3;

public class PrecedenceExample {

    public static void main(String[] args) {

        // 5 + 2 - 3 || 4
        // 7 - 3 = 4
        System.out.println( 5 + 2 - 3 );

       // 5 - 2 + 3 || 6
        // 3 + 3 = 6
        System.out.println( 5 - 2 + 3 );

        // 5 - 2 * 3 || -1
        // 5 - 6
        // -1
        System.out.println( 5 - 2 * 3  ); // -1

       // 10 / 2 * 3 || 2, 15,
        // 5 * 3 = 15
        System.out.println( 10 / 2 * 3 ); // 15




    }

}
