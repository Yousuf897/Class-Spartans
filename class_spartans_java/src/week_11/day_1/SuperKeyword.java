package week_11.day_1;

public class SuperKeyword {

      /*
    Real-life Analogy:

    Imagine a multi-story building where each floor has a manager's office. Now, the manager of the
     2nd floor wants to use a particular file from the 1st floor's manager's office.
     Instead of keeping a copy of the same file on the 2nd floor,  he/she can simply refer
     to the original file in the 1st floor's manager's office.Here, the 1st floor manager's
     office is analogous to the superclass, the 2nd floor manager's office is the subclass,
     and the act of referring to the file on the 1st floor instead of duplicating it is analogous
     to the super keyword.

    Programming Explanation:

    In Java, the super keyword refers to the immediate parent class of a class.
     It's used for the following purposes:

    1. To refer to the parent class instance variable: If child and parent classes have the same variable,
    and you need to refer to the parent class variable in the child class, you can use super.variableName.

    2. To invoke the parent class method: If your child class has overridden one of the parent class's
    methods, you can invoke the parent class method in the child class using super.methodName().

    3. To invoke the parent class constructor: super() is used to call the parent class's
    constructor from the child class. This is especially useful when setting up inheritance
    chains where each class might need some specific initialization.

*/

}
