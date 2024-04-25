package week_4.day_3;

public class ManualCasting {

    public static void main(String[] args) {

        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println( myDouble ); // 9.78
        System.out.println( myInt    ); // 9

        int doubleValue = (int) 100.78;
        System.out.println( doubleValue );

        short byteValue = (short) 33000.8; // -
        System.out.println( "Value: "  + byteValue );

        String str1 = "Hello Java!";

        System.out.println( str1.contains("Java") ); // || True
        System.out.println( str1.contains("java") ); //


        System.out.println( Short.MAX_VALUE );
        System.out.println( Byte.MAX_VALUE );

        // -36 || 36 more bits to store 1500
        // -36 ||

        // 127 --> int

        System.out.println(  Integer.MAX_VALUE );
        // 2147483647 --> 127

    }
}
