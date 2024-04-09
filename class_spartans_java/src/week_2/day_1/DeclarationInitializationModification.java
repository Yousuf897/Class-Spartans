package week_2.day_1;

public class DeclarationInitializationModification {


    /*

    Once you've declared a variable, you can put data in it (this is called "initializing" the variable),
     and you can change that data later on:

    int age;      // Declare
    age = 30;     // Initialize
    age = 35;     // Modify


    Or you can do it all at once:

    int age = 30; // Declare and Initialize


    public class VariableExample {

        public static void main(String[] args) {

            // Local variable
            int score = 100;

            // Using the variable
            System.out.println(score);

            // Modifying the variable
            score = 150;
            System.out.println(score);
        }
    }

    Think of variables as your way to keep track of information that you can use and manipulate throughout
    your program, much like how you'd use boxes to organize and store various items in real life.

    */

    public static void main(String[] args) {

        String firstName; // Declaration
        String lastName; // Declaration
        String middleName; // Declaration

        firstName = "John"; // Initialization
        lastName = "Something"; // Initialization
        middleName = "Alexander"; // Initialization

        System.out.println( firstName );

        firstName = "Erin"; // Modification
        lastName = "Britha"; // Modification
        middleName = "Something"; // Modification

        int number= 10; // Declaration & Initialization
        number = 20; // Modification

        System.out.println( firstName );

    }

}
