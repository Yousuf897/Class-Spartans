package week_13.day_3;

public class Test {

     String firstName; // Field, Variable
     String lastName;
    static String className = "Spartans";
    int countStudent = 0;

    // Constructor
    public Test(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        countStudent++;
    }

    public int getCountStudent() {
        return countStudent;
    }

    // Function (Method)
    void printInfo() {
        System.out.println("FirstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("clasName: " + className);
    }

}
