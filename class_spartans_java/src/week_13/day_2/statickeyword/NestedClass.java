package week_13.day_2.statickeyword;

public class NestedClass { // OuterClass

    // Field
    static String firstName = "John";
    String lastName;

    static class InnerClass {


        public static void main(String[] args) {
            var obj = new NestedClass();

            obj.lastName = "Alexander";
            System.out.println("Your name is: " + firstName);
            System.out.println("Your lastName is: " + obj.lastName);
        }
    }
}
