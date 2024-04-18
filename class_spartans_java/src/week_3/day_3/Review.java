package week_3.day_3;

public class Review {

    // Operators
    // +: Add numbers or Concatenate

    public static void main(String[] args) {
        int numberOne = 100;

        System.out.println( numberOne + 50 );
        System.out.println( numberOne + 50 + 20 + 30);
        System.out.println( numberOne + "40" + 20 + 30);
        // 10040
        System.out.println( numberOne + "40" + (30 + 20) );
        // 100403020
        // 1004050
        System.out.println( numberOne + "40" + (30 + 20) + "TekSchool" );
        // 1004050TekSchool

        // -

        System.out.println( numberOne - 50 ); // print result
        numberOne = numberOne - 50;
        System.out.println( numberOne );
        System.out.println( numberOne = numberOne - 50 ); // store result and then print
        System.out.println( numberOne ); // 50
    }

}
