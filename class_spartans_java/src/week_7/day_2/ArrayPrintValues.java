package week_7.day_2;

public class ArrayPrintValues {

    public static void main(String[] args) {

        String[] studentNames = { "Wasim", "mathias", "Sayed" };
        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);

        System.out.println( studentNames[0].concat(studentNames[1].concat(studentNames[2])) );
        System.out.println( studentNames[0] + " " +(studentNames[1]+ " " + (studentNames[2])) );

        studentNames[2] = "Mahdi";

        System.out.println( studentNames[0] + " " +(studentNames[1]+ " " + (studentNames[2])) );

        studentNames[2] = studentNames[2].replace("Mahdi", "Sayed"); // Sayed

        System.out.println( studentNames[0] + " " +(studentNames[1]+ " " + (studentNames[2])) );


    }

}
