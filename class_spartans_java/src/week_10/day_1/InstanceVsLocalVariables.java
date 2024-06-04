package week_10.day_1;

public class InstanceVsLocalVariables {


/*
    Local Variable vs. Instance Variable - Real-Life Analogy:

    Local Variable: Think of a chef's workstation in a kitchen. When the chef is preparing a specific dish,
    they might bring out certain ingredients and tools to use specifically for that dish. Once the dish is
    prepared and served, those specific ingredients and tools are returned, cleaned, or discarded.
    These temporary items are like local variables – they exist for a specific task and have a limited lifetime.

    Instance Variable: Now, consider the name of the chef, the number of years they've been
    working at that restaurant, or their specialty dish. These are characteristics intrinsic to the
    chef, not just for a particular dish they're preparing. These characteristics stick with the chef as
    long as they're working in that restaurant. In the programming world, such enduring attributes are akin to
    instance variables.

    Local Variable vs. Instance Variable - Programming Explanation:

    Local Variable:

	1.	Declaration & Lifetime: Declared inside a method, constructor, or block and is created
	when the method or block is entered and destroyed once exited.

	2.	Scope: Accessible only within the method or block in which they are declared.

	3.	Default Value: Not automatically initialized (you must provide an initial value before using them).

	4.	Storage: Typically stored on the stack.

    Instance Variable:

	1.	Declaration & Lifetime: Declared inside a class but outside any method, and lasts as long as
	    the object of the class exists.

	2.	Scope: Can be accessed by any method in the class (unless it's private and being accessed
	from another class).

	3.	Default Value: Automatically initialized (e.g., int is initialized to 0, objects to null).

	4.	Storage: Stored in the heap as part of the object.

*/


}
