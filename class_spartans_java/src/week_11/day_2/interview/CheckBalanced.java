package week_11.day_2.interview;

import java.util.Stack;

public class CheckBalanced {

    public static void main(String[] args) {

        String str = "(){}";
        printIsBalanced(str);

    }

    private static boolean isBalanced( String str ) {
        Stack<Character> stack = new Stack<>();
        for ( char ch : str.toCharArray() ) {
            switch (ch) {
                case '<':
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case '>':
                    if ( stack.isEmpty() || stack.pop() != '<' ) {
                        return false;
                    }
                    break;
                case ')':
                    if ( stack.isEmpty() || stack.pop() != '(' ) {
                        return false;
                    }
                    break;
                case ']':
                    if ( stack.isEmpty() || stack.pop() != '[' ) {
                        return false;
                    }
                    break;
                case '}':
                    if ( stack.isEmpty() || stack.pop() != '{' ) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void printIsBalanced( String str ) {
        if ( isBalanced(str) ) {
            System.out.println("yes, it's balanced!");
        } else {
            System.out.println("No, it's not balanced");
        }
    }
}
