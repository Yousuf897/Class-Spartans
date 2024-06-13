package week_11.day_3;

public class StackAndHeap {

    /*
    Real-life Analogy:

    Library (Heap) and Desk (Stack):

     Imagine you're a student and you have a study desk and access to a library. The library (Heap)
     is vast and can store many books (objects) for an undefined amount of time,
     but it takes longer to fetch a book and it's harder to manage the organization of so  many books.
      Your desk (Stack), on the other hand, only has space for a few books (local variables)
      that you're currently studying, but it's faster to grab a book, and once you're
       done with your current study session, those books are removed, making space for your next session.

    Warehouse (Heap) and Backpack (Stack):

    Think of the heap as a large warehouse where you can store items for long durations.
    These items can be of various sizes, and they can stay there as long as needed.
     The stack, on the other hand, is like a backpack you carry. You can quickly put in and
     take out items (like when you're hiking), but it's limited in space, and you only keep what
     you immediately need.

       Programming Explanation:

In Java, memory management primarily occurs in two main areas: the Heap and the Stack.
They serve different purposes and have distinct characteristics:

 I. Heap                                                                                                                                                                                                                                                                          Heap:
                                                                                                                                                                                                                                                                           Purpose: Used for dynamic memory allocation where objects are allocated and deallocated.
1. Storage: All object instances and arrays are stored in the heap.

. 2.The lifetime of objects in the heap is not automatically managed. Once no references point to an object,
it becomes eligible for garbage collection, but it's not immediately destroyed.
                                                                                                                                                                                                                                                                            Access Speed: Accessing objects in the heap is generally slower than stack access.
3. Size: Typically larger than the stack. Its size can be adjusted with JVM parameters.

II. Stack:
                                                                                                                                                                                                                                                                                Purpose: Used for static memory allocation. It follows the Last In First Out (LIFO) principle.
1. Storage: Local variables, primitive data types, and method call references are stored in the stack.

2. Lifetime: Variables in the stack exist only within the scope of the block of code in which they
are defined. Once the execution scope (e.g., method) exits, those variables are automatically destroyed.

3. Access Speed: Accessing variables on the stack is faster.

4. Size: Limited in size and typically smaller than the heap. An overflow of the stack
(due to, say, an unchecked recursion) can lead to a StackOverflowError.

Examples in Java:

    Heap:

    String name = new String("Alice"); // The String object is stored in the heap.

    Stack:

    int x = 10;  // x is a primitive data type and is stored in the stack.

    Understanding the differences between heap and stack is crucial for efficient
    memory management and avoiding errors like StackOverflowError or memory leaks.
*/

}
