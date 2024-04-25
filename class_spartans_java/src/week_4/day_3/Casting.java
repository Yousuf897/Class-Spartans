package week_4.day_3;

public class Casting {

    /*
* Imagine you have a large container filled with water, and you need to transfer this water
* into a smaller bottle. The large container can hold 2 liters, but your bottle can only hold
* 500 ml. To make the water fit into the smaller bottle, you'd need to pour out only a portion
* of the water from the container, essentially "casting" or converting the large amount of water
* to a smaller amount.

Now, in this process, there's a clear loss—you can't fit the entire 2 liters in the 500 ml bottle.
*  But sometimes you're okay with that, especially if you only need the smaller bottle for your trip.

Casting in Java:

In Java, casting refers to the process where you explicitly convert a value from one data
* type to another, especially when the conversion might not be safe and could lead to a potential
* loss of data.

Java supports two types of casting:

1. Widening Casting (Automatically): Converting a smaller data type to a larger data type.
* This is usually safe since there's no data loss.

int myInt = 10;
double myDouble = myInt;  // No explicit casting needed


2. Narrowing Casting (Manually): Converting a larger data type to a smaller one.
* This requires an explicit cast and can lead to data loss, similar to our water example.

double myDouble = 9.78;
int myInt = (int) myDouble;  // Explicitly casting double to int


In the above example, the value of myInt will be 9, since the decimal part is truncated
* (or lost) during casting.


Remember: While widening casting is typically safe (like pouring a small bottle's
* worth of water into a big container), narrowing casting can be risky
* (like trying to fit a container's worth of water into a small bottle).
* Always be cautious and aware when performing narrowing casts to ensure
* you're okay with any potential data loss.


In summary, casting in Java is like adjusting the amount of water to fit a specific container.
*  You might need to pour out some (narrowing) or find a bigger container (widening)
*  depending on the situation.

*
*
* */

    public static void main(String[] args) {

        int intValue = 10;
        double doubleValue = 25.18;

        int result = (int) (intValue + doubleValue);

        System.out.println( result ); // 35.18 ||  35

        System.out.println( 3 + 3.5 ); // 6.5


        int myInt = 10;
        double myDouble = myInt;

        System.out.println( myInt ); // 10
        System.out.println( myDouble ); // 10.0

    }

}
