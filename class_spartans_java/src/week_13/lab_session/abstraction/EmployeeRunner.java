package week_13.lab_session.abstraction;


public class EmployeeRunner {

    public static void main(String[] args) {

        var employeeOne = new Employee("Tony", "Alexander", 65, "Engineer");
        // employeeOne.setFirstName("Alex");
        // Print the information of the user
        employeeOne.printInfo();
    }

}


