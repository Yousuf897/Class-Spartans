package week_13.day_1;

public class finalkeyword {


    /*
    Real-life Analogy:

    Consider a sealed envelope. Once you seal an envelope, you cannot add or remove its contents.
    It's permanent in its current state. Similarly, think of a historical document in a museum,
    protected under glass. You can see it and read it, but you cannot modify it. In both cases,
    the main idea is immutability or permanence.

    Programming Explanation:

    In Java, the final keyword is used to declare that something cannot be changed.
    The final keyword can be applied in various

    contexts:

    1. Final Variables: When a variable is declared with final, its value cannot be modified,
     essentially making it a constant. It must be initialized when declared.

    final int MAX_SPEED = 120; // This value cannot be changed later


    2. Final Methods: If you mark a method as final, it cannot be overridden by any subclass.
    This is especially useful when you want a certain behavior in a method to remain consistent
    across subclasses.

    public final void showDetails() {
        // Some code here
    }

    3. Final Classes: If a class is declared as final, it cannot be subclassed.
    This is a way to make sure that no class can inherit the properties and behaviors of the final class.

    final class ImmutableClass {
        // Class content here
    }


    Benefits:

    1. Immutability: final helps in creating parts of the program that remain constant
    and unchanged, which can be useful in many contexts such as security, thread safety, and clear contract definition.

    2. Protection: Prevents unintended alteration in subclasses.

    3. Performance: Sometimes, compilers can optimize the code when they know certain
     entities (like variables) won't change.

*/

    public static void main(String[] args) {

        final int maxSpeed = 120;
       // maxSpeed = 150; Cannot modify the value of maxSpeed because it's declared as final
        // and final variable values cannot be modified




    }


}
