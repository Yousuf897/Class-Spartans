package week_3.day_1;

import java.awt.image.RasterOp;

public class Review {

    public static void main(String[] args) {
        String  apartment = "Apt";
        int apartmentNumber = 809;
        int  apartmentNumberThree = 910;
        // Difference between print and println
        // String One: Welcome to
        // String Two: TekSchool
        // Expected Output:  Welcome to TekSchool
        System.out.println( " Welcome to TekSchool " );
        System.out.print( "Welcome to" );
        System.out.print( " TekSchool" );

        System.out.println();

        System.out.print( " Welcome to" + " " + "TekSchool" );
        System.out.println("I am in new line");

        System.out.println( Integer.MAX_VALUE );

        // Working with data types
        long longNumber = 2147483648L;
        float floatNumber = 9.9F;
        // char charValue = 'AT';
        String stringValue = "50";
        int number = 50;

        System.out.println( number + 50 ); // 100
        System.out.println( stringValue + 50 ); //  5050

        // You are at 10th grade
        // A 90 to 100 ---> A
        // B 81 to 99 ---> B
        // C

        // Street Number, address
        // 809 int, Apt.809, Apt.910

        String apartmentNumberTwo = "Apt.809";
        System.out.println( apartment +  apartmentNumberThree );
        System.out.println( apartment +  apartmentNumberThree );
        System.out.println( apartment +  apartmentNumberThree );


    }
}
