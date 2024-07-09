package week_15;

public class WhatIsStack {

      /*
    *
    * In Java, a stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle.
    * Think of a stack as a collection of items stacked on top of each
    * other, similar to a stack of plates. The last plate placed on the stack is the first one to be removed.

    Programming-wise, you can implement a stack in Java using the Stack class or by using the Deque interface,
    * specifically the ArrayDeque or LinkedList classes.
    *
    * Here's an example using the Deque interface:

import java.util.Deque;
import java.util.LinkedList;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack using LinkedList
        Deque<Integer> stack = new LinkedList<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        int topElement = stack.pop(); // Removes and returns 30
        int nextElement = stack.pop(); // Removes and returns 20

        System.out.println("Top Element: " + topElement); // Output: Top Element: 30
        System.out.println("Next Element: " + nextElement); // Output: Next Element: 20
    }
}
        Methods for a Stack in Java:

        push(element): Pushes an element onto the top of the stack.
        pop(): Removes and returns the element at the top of the stack.
        peek(): Returns the element at the top of the stack without removing it.
        isEmpty(): Checks if the stack is empty.
        size(): Returns the number of elements in the stack.

    *
    * */

}
