package week_11.day_1.super_keyword;

public class Runner {

    public static void main(String[] args) {

        // Create object of ClassB
        var classBObj = new ClassB();

        // Set a value to firstName
        classBObj.firstName = "John";

        // Print the value of firstName through the created method
        classBObj.printClassBFirstName(); // John,
        classBObj.printClassAFirstName(); // null
        classBObj.printFirstName(); // John

    }

}
