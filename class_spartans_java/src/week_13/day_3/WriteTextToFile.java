package week_13.day_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFile {

    public static void main(String[] args) {

        // Array of String contains the name of the students
        String[] students = {"Bob", "Tony", "Eve", "Jack", "Erin", "Trevor"};
        // int count to count the number of Students
        int count = 1;

        try {
            // Initializing the object of BufferedWriter which gives us the ability to write something
            // to external file
            // new FileWriter --> a class which gives us the ability to write something to an external file
            // new FileReader --> a class which gives us the ability to write something to an external file
            var writer = new BufferedWriter(new FileWriter("studentNames.txt"));

            // Loop through the elements of the array
            for ( String studentName : students ) {
                // Write the elements with the count and move into new line
                // count is the number of counts or students
                // studentName is the elements coming from the array
                // \n jumping into new line
                writer.write( count + ". " + studentName + '\n');
                count++;
            }

            // writer --> is the name of your BufferedWriter object
            // close() --> is a method available in BufferedWriter to close the connection of BufferedWriter
            // After our job is finished.
            // Keep in mind that close() is optional but it's better to close the connection
            // else the connection will be close at the time when execution is finished.
            writer.close();

        } catch ( IOException e ) {
            System.out.println("A message!");
        }


    }

}
