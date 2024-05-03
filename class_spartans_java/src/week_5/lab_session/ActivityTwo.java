package week_5.lab_session;

public class ActivityTwo {

    // 1. Write a Java program to swap two variables without using a third variable.
    // 2. Write a program to check whether a number is even or odd using conditional statements.
    // 3. Write a program that calculates the area of a rectangle given its length and width.
    // 4. Write a program to find the maximum of three numbers using conditional statements.

    public static void main(String[] args) {

//        int a = 70;
//        int b = 30;
//        int c;
//
//        System.out.println("Before value of a: + " + a +" and b: " + b);
//
//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println("After value of a: + " + a +" and b: " + b);


        // Or using the second method
        int a = 70;
        int b = 30;

        System.out.println("Before value of a: + " + a +" and b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After value of a: + " + a +" and b: " + b);


    }

}
