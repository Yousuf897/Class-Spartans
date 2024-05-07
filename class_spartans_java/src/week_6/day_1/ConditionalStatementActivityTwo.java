package week_6.day_1;

public class ConditionalStatementActivityTwo {

    public static void main(String[] args) {

        int marks = 89;
        char grade;

        boolean isLightOn = false;
        int brightness = 0;

         grade = ( marks >= 90 && marks <= 100  ) ? 'A' : 'B';

        System.out.println("Grade: " + grade);

    }

}
