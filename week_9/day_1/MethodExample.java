package week_9.day_1;

public class MethodExample {

    public static String firstName = "";

    // Main method
    public static void main(String[] args) {

        // To Run your program.
        // It's the entry point of your project or program!

        String fullName = "John Doe";
        System.out.println( fullName );

       // How to call a method!
        // nameOfYourMethod();
        printFullName();
        printMenu();
        printMenu();
        printMenu();

        // Calling one of the Built-in methods
        System.out.println( fullName.length() );
        System.out.println( fullName.toUpperCase() );
        System.out.println( fullName.toLowerCase() );


    }

    // User defined method
    public static void printFullName() {
        System.out.println( " Erin Alexander " );
    }

    public static void printMenu() {
        System.out.println(" * * * * * Menu * * * * * ");
        System.out.println("1. Print your firstName.");
        System.out.println("2. Print your lastName.");
        System.out.println("3. Print your fullName.");
    }

    public void printMenuTwo() {
        System.out.println(" * * * * * Menu * * * * * ");
        System.out.println("0. Print your firstName.");
        System.out.println("2. Print your lastName.");
        System.out.println("3. Print your fullName.");
    }

    public void printName() {
        System.out.println( "John Doe" );
    }


}
