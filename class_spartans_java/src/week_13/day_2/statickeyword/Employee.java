package week_13.day_2.statickeyword;

public class Employee {

    // Fields
    private String firstName;
    private int age;
    private static int countEmployee = 0;

    // Constructor
    public Employee(String firstName, int age) {
        setFirstName(firstName);
        setAge(age);
        countEmployee++;
    }

    private String getFirstName() {return firstName;}
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private int getAge() {return age;}
    private void setAge(int age) {this.age = age;}

    public static void printInfo() {
        System.out.println("Message from static method!" );
    }

    public static void printEmployeeCount() {
        System.out.println("Count of Employee: " + countEmployee);
    }

    public void printInfoNonStatic() {
        System.out.println("Employee Name: " + getFirstName());
        System.out.println("Employee Age: " + getAge());
    }

}
