package week_13.day_2.exceptionhandling;

public class WhatIsExceptionHandling {

        /*
    *
    * a checked exception is an exception that is checked at compile-time. This means that the compiler requires that the exception either be caught
    *  a try-catch block or be declared to be thrown by the method using the throws clause. Checked exceptions typically represent situations that a
    *  well-written application should anticipate and recover from.


public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
    *
    * */

}
