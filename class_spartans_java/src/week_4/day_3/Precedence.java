package week_4.day_3;

public class Precedence {

    /*

    Precedence in Daily Life:

    Imagine you're at a dinner party and you're deciding the order in which you'll eat your food.
    Based on etiquette or personal preference, you might follow these steps:

    Starters/Appetizers: Maybe some soup or salad.
    Main Course: Perhaps a steak or some pasta.
    Dessert: A slice of cake or ice cream.

            Even if all the dishes are placed in front of you at the same time, you'll have an
            inherent understanding of which dish to start with and which to finish with.
            This is because, in our cultural or personal understanding, there's a "precedence"
            or order to things.

    Precedence in Java:

    In Java (and most programming languages), certain operations are performed before others
    based on their "precedence". This is essential to ensure calculations and evaluations are
     done in the correct order, especially when multiple operations are combined in a single
     expression.

    For example, in the mathematical expression 3 + 5 * 2, even though addition comes first from
    left to right, multiplication has a higher precedence. So, the multiplication is done before
     the addition, resulting in 3 + 10 = 13, and not (3 + 5) * 2 = 16.

    When you're not sure about the order, or when you want to override the natural precedence,
    you can use parentheses () to make things clear. Just like in mathematics, operations inside
    parentheses will be executed before those outside.

    For example:

            3 + 5 * 2 would be 13 because multiplication comes before addition.
            (3 + 5) * 2 would be 16 because the parentheses change the order of operations.

    Understanding operator precedence is key to writing clear and correct expressions in Java.
*/

    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 15.5;
        String message = "Welcome Student!";

        double speed = 130;

        System.out.println("The result of calculation is: " + (intValue + doubleValue) ); // 25.5
        System.out.println("Your speed is: " + speed );

        // 3 + 3 + 10 = 16
        System.out.println( 3 + 3 + 10 );

        // 10 + 10 + 10 * 5 = 70
        // 10 + 10 + 50
        // 70
        System.out.println( 10 + 10 + 10 * 5 );

        // 5 + 5 ( 2 + 3 ) * 5  || 130
        // 5 + 5 * 5 * 5
        // 5 + 25 * 5
        // 5 + 125
        // 130
        System.out.println( 5 + 5 * ( 2 + 3 ) * 5 ); // 130

        // 5 * 2 + 1 ( 1 * 0 ) + 5 * 1 * 0 + 1 || 11
        // 5 * 2 + 1 * 0 + 5 * 1 * 0 + 1
        // 10 + 1 * 0 + 5 * 1 * 0 + 1
        // 10 + 0 + 5 * 0 + 1
        // 10 + 0 + 0 + 1
        // 11
        System.out.println( 5 * 2 + 1 * ( 1 * 0 ) + 5 * 1 * 0 + 1 ); // 11

        // [ ( 5 + 2 ) * 2  ]  + [ ( 1 * 0 ) * 0 + 1 ]|| 15, 1, 14, 21,
        // [ 7 * 2 ] + [ 1 ]
        // 14 + 1
        // 15
        System.out.println( ( ( 5 + 2 ) * 2  ) + ( ( 1 * 0 ) * 0 + 1 ) ); // 15

        String[] messageTwo = {"Welcome", "To", "Java"};
        //                      0           1      2

        System.out.println( messageTwo[1] );
        System.out.println( message.charAt(1) );


    }
}
