package week_13.day_2.exceptionhandling;

public class TypesOfException {


    /*
    * Two types of Exceptions are explained below in detail.

    Checked Exception: These exceptions are checked by the compiler at the time of compilation.
    * Classes that extend Throwable class except Runtime exception and
    * Error are called checked Exception. Checked Exceptions must either declare the exception using
    * throes keyword (or) surrounded by appropriate try/catch.
    *  E.g. ClassNotFound Exception

    Unchecked Exception: These exceptions are not checked during the compile time by the compiler.
    * The compiler doesn’t force to handle these exceptions It includes: • Arithmetic Exception •
    * ArrayIndexOutOfBounds Exception


 public static void main(String[] args) {

        // Arithmetic Exception
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        // ArrayIndexOutOfBounds Exception
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];  // Index 5 is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
    }




import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExample {

    // Using 'throws' to declare the exception
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

    *
    *
    *
    * */


}
