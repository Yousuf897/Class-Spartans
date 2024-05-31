package week_9.lab_session;

public class MethodActivityTwo {

    // Write a Java method named printStars that prints 5 asterisks (*) on a single line.
    // This method should not require any parameters.

    public static void main(String[] args) {
        printStars(5);
        System.out.println();
        printStars(10);
        System.out.println();
        printStars(15);
    }

    public static void printStars( int numOfStars ) {
        for ( int i = 1; i <= numOfStars; i++ ) {
            System.out.print(" * ");
        }
    }
}
