package week_4.day_1;

public class Review {

    public static void main(String[] args) {

        String firstName = "Tony"; // Reference is going to be stored
        // in heap memory and reference is going to be assigned to variable.

        String lastName; // Declaration
        lastName = "Alexander"; // Initialization

        lastName = "Morphy"; // Modification

        int age = 12; // Declaration and Initialization
        age = 20;

        printMessage();

    }

    // Custom Method: Methods which are created by the user.
    public static void printMessage() {
        System.out.println("Hello From Custom Method");
    }

}
