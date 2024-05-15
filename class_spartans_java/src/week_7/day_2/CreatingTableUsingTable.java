package week_7.day_2;

public class CreatingTableUsingTable {

    // Creating table using java
    // What is table?
    // Rows, Columns


    public static void main(String[] args) {
        String[] names = { "John", "Eric", "Tony"}; // One Dimension Array
        String[][] studentNames = new String[2][3]; // Two Dimension Array

        // Max row --> n - 1 --> 2 - 1 => 1
        // Max Col --> n - 1 --> 3 - 1 => 2

        studentNames[0][0] = "Bob";
        studentNames[0][1] = "Doe";
        studentNames[0][2] = "John";

        // Second Row
        studentNames[1][0] = "Tony";
        studentNames[1][1] = "Max";
        studentNames[1][2] = "Eric";

        // Print Values

        System.out.println( studentNames[0][0] );



    }


}
