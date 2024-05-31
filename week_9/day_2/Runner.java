package week_9.day_2;

public class Runner {

    // Method {
    // // Body
    // }

    public static void main(String[] args) {
        // Built-In methods
        String fullName = "John Doe";
        System.out.println( fullName.length() );
        // Call User Defined method
        // nameOfYourMethod();
        printNumbersFromOneToTen();
    }

    //
    public static void printNumbersFromOneToTen() {
        // Body of method
        for ( int number = 1; number <= 10; number++ ) {
            System.out.println( number );
        }
    }
}
