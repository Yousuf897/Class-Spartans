package week_9.day_1;
public class Employee {
    public static void main(String[] args) {
        // Create Object of EmployeeInformation Class
        var empInfoObj = new EmployeeInformation();
        empInfoObj.getUserFirstAndLastName();
        empInfoObj.printBasedOnUserInput( empInfoObj.printMenuAndGetUserInput() );
        //  int userInput = printMenuAndGetUserInput();
    }
}
