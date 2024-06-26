package week_13.day_2.statickeyword;

public class Runner {

    public static void main(String[] args) {

        var firstWorker = new WorkShop();
        var secondWorker = new WorkShop();

        var employeeOne = new Employee("John", 21);
        var employeeTwo = new Employee("Tony", 31);
        var employeeThree = new Employee("Tony", 36);
        var employeeFour = new Employee("Tony", 46);

       Employee.printEmployeeCount();

        Employee.printInfo();

        System.out.println(WorkShop.toolBox);

    }



}
