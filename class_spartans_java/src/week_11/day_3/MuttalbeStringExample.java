package week_11.day_3;

public class MuttalbeStringExample {

    public static void main(String[] args) {

        // Create an object of String
        var string = new String(); // Immutable String --> Not changeable

        // Create an object of StringBuilder
       // var stringBuilder = new StringBuilder("Hello world"); // Mutable String --> changeable.
        var stringBuilder = new StringBuilder();

        // How to Insert Value to StringBuilder
        // insert() --> Add value to StringBuilder
        // nameOfYourStringBuilder.insert( " Value " );
        // stringBuilder.insert("Hello World");

        // Print value of StringBuilder
       // System.out.println( stringBuilder );

        // append();
        stringBuilder.append("Hello World");

        // print the value
        System.out.println( stringBuilder );

        stringBuilder.append(" Java is easy!");
        // stringBuilder.append(" ").append("Java is easy!");
        System.out.println( stringBuilder );

        stringBuilder.delete(0, 10);
        stringBuilder.delete(0, stringBuilder.length() - 2);
        System.out.println( stringBuilder );


        System.out.println( stringBuilder.length() - 1 );
        System.out.println( stringBuilder.length() );
       //  System.out.println( stringBuilder.charAt( stringBuilder.length() ) );


        // Create an object of StringBuffer
        var stringBuffer = new StringBuffer();

    }

}
