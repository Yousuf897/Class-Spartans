package week_4.day_2;

public class WorkingWithPromotion {

    public static void main(String[] args) {

        byte byteVariable = 127;
        short shortVariable = 220;
        char charValue = 'A';
        int intVariable = 1500;
        long longVariable = 2500L;
        float floatVariable = 2.5F;
        double doubleVariable = 300.9;

        int result = intVariable + byteVariable + shortVariable + charValue;
       int resultTwo = byteVariable + shortVariable + charValue;


        long resultThree = intVariable + byteVariable + shortVariable + charValue + longVariable;

        float resultFour = intVariable + byteVariable + floatVariable + shortVariable + charValue + longVariable;


        // int + float + long = float
        // byte + int + long = long
        // short + byte + char = int
        // long + float + int = float
        // byte + int + short + float + long + char = float


       double resultFive = byteVariable + charValue + intVariable + floatVariable + doubleVariable;

      float resultSix = byteVariable + intVariable + floatVariable;

        System.out.println( resultSix ); // 1629.5

        int resultSeven =  (int) (byteVariable + intVariable + floatVariable);

        System.out.println( resultSeven ); // 1629
        System.out.println( resultSeven ); // 1629

        byte byteResult =  (byte) (byteVariable + intVariable + floatVariable);

        System.out.println( byteResult ); // Why 93 is being printed in here??



    }

}
