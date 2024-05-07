package week_6.day_1;

public class BooleanOperators {

    /*
    Real-life analogy:
    Imagine you have two light switches controlling a single light bulb.
    For the light to turn on, specific conditions related to both switches need to be met.

    For example:

    Both switches are ON.
    Only one switch is ON, but not both.
    At least one of the switches is ON.

    These scenarios reflect the basic boolean logic operations: AND, OR, and XOR (exclusive OR), NOT operator.

    Java-related explanation:

    Boolean logic operations deal with true and false values and determine the result based on
    specific conditions:

    1. AND (&&): Both conditions must be true.

    true && true = true
    true && false = false
    false && true = false
    false && false = false

   if ( condition && condition )

    */

    public static void main(String[] args) {

        System.out.println(true && false && true & false);
    }

}
