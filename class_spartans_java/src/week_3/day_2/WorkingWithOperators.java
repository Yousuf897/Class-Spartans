package week_3.day_2;

public class WorkingWithOperators {

    // Operators
    // +: Adds two or multiple numbers together.
    // -: Subtract two or multiple numbers together.

    public static void main(String[] args) {

        System.out.println( " * * * * *  * * * * *  Addition  * * * * *  * * * * *  " );

        int numberOne = 70;
        int numberTwo = 80;
        int result = numberOne + numberTwo;

        System.out.println("Result: " + result ); // Result: 30
        System.out.println("Result: " + result * 2 ); // Result: 60

        System.out.println( "Result: " + numberOne + numberTwo );
        System.out.println( "Result: " + ( numberOne + numberTwo ) );
        System.out.println( "Result: " + ( 10 + 20 ) );

        // Expected outPut: Result: 30
        // The sum of X + Y = Z

        // Where is X is the firstNumber
        // Y is the secondNumber
        // Z is the result of firstNumber and secondNumber



        // The sum of X + Y = Z

        System.out.println( "The sum of " + numberOne + " + " + numberTwo + " = " + ( numberOne + numberTwo ));

        System.out.println( "The sum of " + numberOne + " + " + numberTwo + " = " + result );

        System.out.println( "The sum of X + Y = Z" );


        System.out.println( 150 + 20 + "Tony" + "Eric" + 50 );

        String name = "Zia";
        String  lastName = "Mustafa";
        int salary = 450_000;

        System.out.println( name + lastName + salary ); // ZiaMustafa450_000;


        System.out.println( " * * * * *  * * * * *  Subtraction  * * * * *  * * * * *  " );

        int numberThree = 55;
        int numberFour = 10;
        int subTractResult = numberThree - numberFour;
        //      Container =   55        -     10
        //      Container = 45;

        System.out.println("Result: " + subTractResult );

        System.out.println( 150 - 20 + " Tony " + "Eric " + 50 ); // 130 Tony Eric 50


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  " );

    }

}
