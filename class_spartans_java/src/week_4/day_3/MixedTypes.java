package week_4.day_3;

public class MixedTypes {

    /*

    Imagine you're baking cookies. You have different ingredients: 3.5 cups of flour, 2 eggs,
    and 1.5 cups of sugar. Now, even though the quantities and measurements of these ingredients differ,
    you can mix them all together to make cookie dough. Some ingredients are whole numbers (like eggs),
    while others might be fractions or decimals (like cups of flour or sugar). Yet, they all come
    together harmoniously in the recipe.

    In Java, when you're performing operations that involve different data types, this is referred to
    as "mixed-type" computation. The system has to decide on a "common" data type to which all others
    will be converted before the operation is executed. This is done to ensure compatibility and prevent
    data loss.

    Here's a general rule for mixed-type computation in Java:

    If one of the operands is double, the other is converted to double.
    Otherwise, if one of the operands is float, the other is converted to float.
    Otherwise, if one of the operands is long, the other is converted to long.
    Otherwise, both operands are converted to int.

    Examples:

    int + float:


    int a = 5;
    float b = 2.5f;
    float result = a + b;  // 'a' is promoted to float for this operation
    System.out.println(result);  // Output: 7.5


    long + double:


    long c = 10L;
    double d = 5.5;
    double result2 = c + d;  // 'c' is promoted to double for this operation
    System.out.println(result2);  // Output: 15.5
*/


}
