package week_15;

import java.util.List;
import java.util.Stack;

public class StackActivity {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
//        List<String> stackTwo = new Stack<>();
//        var stackThree = new Stack<String>();
        String[] words = { "Spartans", "TekSchool", "java", "selenium", "Automation" };


        // Add element to stack
        stack.push("Tony");
        stack.push("Bob");
        stack.push("Eve");
        stack.push("Trevor");

        // LIFO

        // Print the elements of stack
        System.out.println(stack);

        // Remove element from stack
        stack.pop(); // Trevor

        // Print the updated version of stack
        System.out.println(stack);

        // To Check the top of the stack
        System.out.println( stack.peek() );

        // Remove the top element
        String value = stack.pop();


        System.out.println( stack );

        // Check if the stack is empty
        System.out.println( stack.isEmpty() );

         while ( !stack.isEmpty() ) {
             stack.pop();
         }

        System.out.println( stack );

         for ( String word : words ) {
             stack.push(word);
         }

         // Print the elements of stack
        System.out.println( stack );

         stack.pop();

        System.out.println(  stack );

        System.out.println( stack.peek() );




    }

}
