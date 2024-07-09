package week_15;

public class ProsAndConsVector {

    /*
    *
    * Pros of vector:
    *
    *     Dynamic Sizing: Vectors automatically resize themselves when needed, which makes them suitable
    * for situations where the number of elements is
    *      not known in advance. This eliminates the need to manually manage the size of the data structure.

    Thread-Safe: Vectors are synchronized, making them thread-safe. This means that multiple threads can safely
    * access and modify a vector without
    * causing data corruption or concurrency issues.

    Legacy Support: Vectors have been part of Java since early versions, so they are widely supported
    * and compatible with older codebases.

    Ordered: Vectors maintain the order of elements, making them suitable for scenarios where the order
    * of insertion matters.

    Cons:

    Performance Overhead: Due to synchronization, vectors can have a performance overhead, especially
    * in multi-threaded environments.
    *
    * If thread-safety is not required, other collections like ArrayList might be more efficient.

    Limited Flexibility: While vectors can grow and shrink dynamically, they may not be the most
    * efficient choice for scenarios where elements
    *  are frequently added or removed in the middle, as shifting elements can be costly.

    Outdated: With the introduction of more modern collections in Java, such as ArrayList, LinkedList,
    * and the Collections Framework,
    *  vectors are considered somewhat outdated. Newer collections often offer better performance
    * and flexibility.

    Size Management: Vectors resize by doubling in size when they reach their capacity, which may lead
    * to memory wastage in
    * cases where you have a large vector with only a few elements.

In summary, vectors are a legacy data structure in Java that provide thread-safety and dynamic
* sizing but come with performance overhead and may not be
*  the most efficient choice for all scenarios. Depending on your specific requirements, you may
* want to consider alternative collections like ArrayList
* or LinkedList for better performance and flexibility.
    *
    * */

}
