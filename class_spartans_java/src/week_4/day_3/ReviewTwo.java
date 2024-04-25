package week_4.day_3;

public class ReviewTwo {

    public static void main(String[] args) {

        System.out.println( 10 + 10 ); // 20 --> int
        System.out.println( 127 + 1500 ); // byte + short --> int

        // 1. byte, short, char --> int
        byte byteValue = 127;
        short shortValue = 1500;
        int intValue = 35000;
        long longValue = 65000L;
        float floatValue = 35.6F;
        double doubleValue = 65.5;

        // valuef
        // valueL

        int result = byteValue + shortValue;

        // 2. byte, short, char, int, long

        long resultTwo = byteValue + intValue + longValue; // Long

        // 3. byte, short, char, int, long, float

        long resultThree = byteValue + intValue + longValue; // float

        // 3. byte, short, char, int, long, float, double

        double resultFour = byteValue + intValue + longValue + doubleValue; // double
    }

}
