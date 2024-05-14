package week_7.day_1;

public class EmployeeExampleTwo {

    public static void main(String[] args) {

        char[] characters = new char[5]; // Static

        // Declared an array of size 5 of type String
        String[] employeeFirstNames = { "Bob", "Tony", "Eric", "Erin", "John", "Alexander" };
        int[] numbers = { 10, 100, 250, 0, 1, 3, 4, 50, 70, 90 };

        System.out.println( employeeFirstNames[0] );
        System.out.println( employeeFirstNames[1] );
        System.out.println( employeeFirstNames[2] );
        System.out.println( employeeFirstNames[3] );
        System.out.println( employeeFirstNames[4] );
        System.out.println( employeeFirstNames[5] );

        System.out.println( numbers[ numbers.length-4 ] );

    }

}
