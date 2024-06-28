package week_13.lab_session.abstraction;


public class StudentRunner {

    public static void main(String[] args) {


    var studentOne = new Student("Alex", "alex lastName", 19, "Engineer");
    var employeeObj = new Employee("Tony", "morphy", 49, "Automation Engineer");

    studentOne.printInfo();
    employeeObj.printInfo();

    }
}
