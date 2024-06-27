package week_13.day_3;

public class Exceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Hello World");

            System.out.println( 5 / 0 );

        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide the number by zero!");
            e.printStackTrace();
        }

        System.out.println("Welcome to java class");
        System.out.println("Java is easy!");


    }

}
