package week_6.day_2;

public class Test {

    public static void main(String[] args) {

        if (10 < 10 && 10 > 5) {
            System.out.println("A");
            System.out.println("B");
            if (true && false && true && true) {
                System.out.println("B");
                if ( true ) {
                    System.out.println("b");
                } else {
                    System.out.println("a");
                }
            } else {
                System.out.println("C");
            }
            if (5 > 0) {
                System.out.println("Z");
            }
            System.out.println("Spartans");
        } else {
            System.out.println("java is easy!");
        }

    }
}
