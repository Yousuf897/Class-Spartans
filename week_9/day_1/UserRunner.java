package week_9.day_1;

public class UserRunner {

    public static void main(String[] args) {

        // Create an object of UserInformation for 1st Student!
        var stdFirstObj = new UserInformation();
        stdFirstObj.id = 101;
        stdFirstObj.firstName = "John";
        stdFirstObj.lastName = "Doe";
        stdFirstObj.gender = 'M';
        stdFirstObj.dateOfBirth = "12/12/1995";
        stdFirstObj.occupation = "Test Engineer";
        stdFirstObj.printUserInformation();
        // System.out.println( stdFirstObj.firstName );

        System.out.println(" * * * * * * *  * * * * * * *  * * * * * * * ");

        // Create an object of UserInformation for 1st Student!
        var secondStdObj = new UserInformation();
        secondStdObj.id = 201;
        secondStdObj.firstName = "Erin";
        secondStdObj.lastName = "Morphy";
        secondStdObj.gender = 'F';
        secondStdObj.dateOfBirth = "09/10/1994";
        secondStdObj.occupation = "Senior Test Engineer";
        secondStdObj.printUserInformation();

    }
}
