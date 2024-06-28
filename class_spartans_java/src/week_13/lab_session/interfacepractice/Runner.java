package week_13.lab_session.interfacepractice;

public class Runner {

    public static void main(String[] args) {

        var studentOne = new Student(
                "Tony",
                "Alexander",
                "05/07/1965",
                "Engineer");

        studentOne.printInfo();

        System.out.println( " * * * * * * * * * *  * * * * * * * * * *  * * * * * * * * * * " );

        var employeeOne = new Employee(
        "Eric",
        "Morphy",
        "02/03/1976",
        "Software Engineer"
        );

        employeeOne.printEmployeeInfo();
        System.out.println( employeeOne.calculateSalary() );

    }

}
