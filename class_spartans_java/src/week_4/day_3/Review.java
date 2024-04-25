package week_4.day_3;

public class Review {

    public static void main(String[] args) {


        // indexOf()
        String message = "Java is easy!";
        char character = 'a';
        System.out.println("Index of " + character + " is: " + message.indexOf(character) );


        System.out.println( message.indexOf("easy") ); // 8
        System.out.println( message.indexOf("easy!") ); // 8
        System.out.println( message.indexOf('e') ); // 8 // 8

        System.out.println( " * * * * *  * * * * *  * * * * * " );

        System.out.println( message.contains("Java") ); // True
        System.out.println( message.contains("java") ); // False

        System.out.println( " * * * * *  * * * * *  * * * * * " );

        // == Equality Operator
        System.out.println( 3 == 3 ); // true
        System.out.println( 3 == 3.0 ); // true
        System.out.println( 3 + 3.0 ); // 6.0

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println( str1 == str2 ); // String, non-primitive (Reference)
        // 102 == 102 --> True || Hello == Hello ?

        // equals()
        String str3 = new String("hello");

        System.out.println( str1 == str3 ); // false
        System.out.println( str1.equals(str3) ); //   Hello == Hello ==> Yes --> True
        System.out.println( str1.equals(str3) ); //  Hello is not equal to hello --> False

        System.out.println( " * * * * *  * * * * *  * * * * * " );

    }

}
