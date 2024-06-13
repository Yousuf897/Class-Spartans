package week_11.day_3;

public class StringLitteral {

     /*  Real-life Analogy:

    Imagine a library where each unique book is stored only once. If multiple people want to read the same
    book title, they don't each get a unique copy of that book. Instead, they all reference or point to that
    single book in the library. If a new unique book title is introduced, it's added
    to the library's collection. But, again, if multiple people want to read that same new title,
    they all reference the single copy in the library.

    Programming Explanation:

    In Java, the String class is special, and literals are treated differently than most other objects.

    String Pool: When you create a string literal (e.g., String str = "Hello";), Java checks in a special
    memory region called the "String Pool" to see if that string value already exists.

    Reuse of String Literal: If the string value already exists in the pool, Java will reuse that
    value and assign its reference to the variable instead of creating a new object. This is efficient
    for memory.

    New Objects: If you create a string using the new keyword (e.g., String str = new String("Hello");),
    it's treated like a regular object, and a new memory location is allocated,
     even if the same value exists in the string pool.

    Immutability: Strings in Java are immutable. This means once a String object is created,
    it cannot be changed. If you modify its value, a new object is created in memory.
    This immutability allows Java to safely reuse string literals without any unforeseen side effects.

    Example in Java:

    String s1 = "Hello";      // String literal, checks/reuses value in String Pool.
    String s2 = "Hello";      // Reuses the same reference from String Pool as s1.
    String s3 = new String("Hello"); // New object, doesn't check String Pool.

    System.out.println(s1 == s2); // true, because both reference the same value in String Pool.
    System.out.println(s1 == s3); // false, because s3 is pointing to a new object in memory.


    In the above example, s1 and s2 point to the same memory location in the String Pool
    because they both are initialized with the same string literal. On the other hand,
     s3 points to a different memory location since it's created using the new keyword.

 */

}

