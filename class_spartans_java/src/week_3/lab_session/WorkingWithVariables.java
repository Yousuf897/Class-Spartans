package week_3.lab_session;

public class WorkingWithVariables {

    /*
    *
    * Q1. Declare and initialize an integer variable num with the value 10 and print it.
    *
    * Q2.Identify the incorrect variable declaration from a given set: int a1 = 5;, double b1 = 0.25;,
    * char c1 = 'abc';, boolean d1 = true;.
    *
    * Q3: Fix the code snippet that initializes an integer without
    * declaring it first: num = 8; System.out.println(num);.
    *
    * Q4: Given the code, determine the output: int a = 5; int b = a; b = 3; System.out.println(a);.
    *
    * Q5:  Examine the consequences of using an uninitialized variable in
    * the code double price; System.out.println("Price is: " + price);.
    *

     * */

    public static void main(String[] args) {

        // Q1 Answer:
        int num = 10;
        System.out.println( num );
        System.out.println("Value: " + num );

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");

        // Q2 Answer:
        // c1 hols multiple characters which is not acceptable by the compiler since char
        // can accept only one character.
        int a1 = 5; double b1 = 0.25; /*char c1 = 'abc'; */ boolean d1 = true;
        int numberOne; double numberTwo;

        System.out.println( a1 + " " + b1 );

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");

        // Q3 Answer:
        // Data type is missing, according to the value "8", int is the correct data type.
        int num1 = 8;
        System.out.println(num);


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");

        // Q4 Answer:
        int a = 5;
        int b = a;
        b = 3;
        System.out.println(a);


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");

        // Q5 Answer:
        // The reason behind price getting an error is because, price is initialized.
        // Local variables needs to be initialized before being used in the code.
        double price;
        // System.out.println("Price is: " + price);


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");

    }


}
