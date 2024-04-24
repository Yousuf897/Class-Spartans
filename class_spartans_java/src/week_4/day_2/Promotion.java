package week_4.day_2;

public class Promotion {

     /*
 * Promotion in Real Life:

Imagine you're organizing books on a bookshelf based on their sizes, from small pocketbooks to
*  larger encyclopedias. One day, you decide to place all your books into bigger encyclopedia-sized
* boxes, regardless of their original size. Small pocketbooks, medium-sized novels, and even slightly
*  larger textbooks all get their own big encyclopedia-sized box. By doing this, you're ensuring
*  that every book has at least the space of the largest book, even if it doesn't need it.
*
* This act of giving all the books the same larger space is similar to promotion in Java.


Promotion in Java:

In Java, promotion refers to the process where a smaller data type is automatically converted
* (or promoted) to a larger data type without any explicit request from the developer.
* This is done mainly to prevent loss of data and ensure compatibility when performing operations
*  with variables of different data types.

Here are some general rules for promotion:

    Byte, Short, and Char: When you use the byte, short, or char data types in an expression,
    *  they are promoted to int if any operand is an int.

    Int: If one operand is a long, the whole expression is promoted to long.

    Float: If one operand is a float, the entire expression is promoted to float.

    Double: If any of the operands are double, the entire expression is promoted to double.


byte a = 10;
int b = 20;
double c = 30.5;

double result = a + b + c;  // 'a' is promoted to int, then the entire expression is promoted
* to double.



Here, the byte value a gets promoted to int for the addition operation. After that, since
*  we're adding an int and a double, the entire expression is promoted to double to accommodate
* the larger data type.

This automatic conversion is useful, as it ensures that data isn't lost unintentionally.
* However, it's also crucial to be aware of this behavior, especially when working with mixed data
*  types, to ensure the results are as expected.

 *
 * */

}
