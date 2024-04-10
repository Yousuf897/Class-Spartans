package week_2.day_2;

import static java.lang.Byte.*;

public class DataType {

    public static void main(String[] args) {

        // Non-Decimal Values
        byte byteNumber = 127; // max value of byte
        short shortNumber = 32767; // max value of short
        int intNumber = 2147483647; // max value of int
        long longNumber = 9223372036854775807L; // max value of long

        // Decimal Values
        float floatNumber = 1.0000F; // make sure to use f or F at the end of the value
        double doubleNumber = 10.01; // make sure to use decimal point, if not, it will be automatically
                                     // converted!

        // Char values
        char charValue = 'A'; // Any character except sequence of character!

        // Boolean values
        boolean isLightTurnedOn = false; // true / false!


        // Print the minimum and maximum values of Byte data type.
        System.out.println( "Min value of Byte: " + Byte.MIN_VALUE );
        System.out.println( "Max value of Byte: " + Byte.MAX_VALUE );

        // Print the minimum and maximum values of Short data type.
        System.out.println( "Min value of Short: " + Short.MIN_VALUE );
        System.out.println( "Max value of Short: " + Short.MAX_VALUE );

        // Print the minimum and maximum values of int data type.
        System.out.println( "Min value of Int: " + Integer.MIN_VALUE );
        System.out.println( "Max value of Int: " + Integer.MAX_VALUE );

        // Print the minimum and maximum values of Long data type.
        System.out.println( "Min value of Long: " + Long.MIN_VALUE );
        System.out.println( "Max value of Long: " + Long.MAX_VALUE );

        // Print the minimum and maximum values of Float data type.
        System.out.println( "Min value of Float: " + Float.MIN_VALUE );
        System.out.println( "Max value of Float: " + Float.MAX_VALUE );

        // Print the minimum and maximum values of Double data type.
        System.out.println( "Min value of Double: " + Double.MIN_VALUE );
        System.out.println( "Max value of Double: " + Double.MAX_VALUE );

    }

}
