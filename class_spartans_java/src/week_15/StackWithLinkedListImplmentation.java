package week_15;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithLinkedListImplmentation {

    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();
        String[] words = { "Spartans", "TekSchool", "java", "selenium", "Automation" };

        // Add elements
        for ( String word : words ) {
            stack.push(word);
        }

//        System.out.println( stack );
//
//        System.out.println( stack.peek() );
//        System.out.println( stack.peekFirst() );
//        System.out.println( stack.peekLast() );

        // Remove elements from Stack
        System.out.println( stack.pop() );

        System.out.println( stack );

        System.out.println( stack.poll() );
        System.out.println( stack.pollFirst() );
        System.out.println( stack.pollLast() );

        System.out.println( stack );

    }
}
