package week_13.day_3;

// Import necessary classes for file input/output operations and exceptions
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Define a public class named ReadFromExternalFile
public class ReadFromExternalFile {

    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {

        // Start a try block to handle potential exceptions
        try {
            // Create a BufferedReader object named 'reader' to read from a file
            var reader = new BufferedReader(new FileReader("employeeNames.txt"));

            // Declare a String variable named 'value' to hold each line read from the file
            String value;

            // Read lines from the file until the end is reached (reader.readLine() returns null)
            while ((value = reader.readLine()) != null) {
                // Print each line read from the file to the console
                System.out.println(value);
            }

            // Close the BufferedReader to release system resources
            reader.close();

            // Catch block to handle FileNotFoundException, which occurs when the specified file is not found
        } catch (FileNotFoundException e) {
            // Print a message indicating the file was not found
            System.out.println("File not found, please try again!");

            // Catch block to handle IOException, which occurs for any other I/O related issues
        } catch (IOException e) {
            // Print a generic message for IOException
            System.out.println("IO Exception!");
        }

    } // End of main method

} // End of ReadFromExternalFile class
