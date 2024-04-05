package week_1.lab_session;

public class VariableTest {
    static String firstName = "Tony";
    static String firstNameTwo = "Tony";
    public static void main(String[] args) {
        System.out.println( firstName ); // Tony
        printName(); // Tony
    }

    public static void printName() {
        System.out.println( firstName ); // Tony
    }
}
