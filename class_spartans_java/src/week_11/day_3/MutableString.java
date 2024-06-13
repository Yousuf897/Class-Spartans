package week_11.day_3;

public class MutableString {

    /*

    1. StringBuilder:

    Mutable: Unlike the String class, StringBuilder is mutable, which means you can modify its contents
     without creating a new object.

    Performance: It's faster than using String for concatenations in a loop because it doesn't
    create a new object for each

    modification.

    Not Thread-safe: StringBuilder is not synchronized, which means it's not thread-safe.
    It's suitable for use in a single-threaded environment.

    Methods: Provides methods such as append(), insert(), delete(), reverse(),
    and more to manipulate strings.

    2. StringBuffer:

    Mutable: Just like StringBuilder, StringBuffer is also mutable.

    Performance: While it is faster than String for frequent modifications,
    it's generally slower than StringBuilder because of its synchronized nature.

    Thread-safe: StringBuffer is synchronized, which means it is thread-safe.
    It can be safely used in multi-threaded environments without external synchronization.

    Methods: Provides the same methods as StringBuilder for string manipulation.

    Real-life Analogy:

    Imagine you're working on a document. If you use a typewriter (which works like the String class),
     every time you make a change, you'd have to retype the entire document.
      This is tedious and inefficient. But with a computer word processor (like StringBuilder),
    you can make edits anywhere in the document without retyping everything.
    Now, if multiple people want to edit the document
    simultaneously, they'd need a system to ensure they don't make conflicting changes.
     A tool that manages this (like Google Docs)
    can be compared to StringBuffer, ensuring edits are synchronized and don't conflict.

    When to use which?

    1. Use String when your string won't change often.
    2. Use StringBuilder when you need to modify a string frequently in a single-threaded environment.
    3. Use StringBuffer when you need to modify a string frequently in a multi-threaded environment.

    */

}

