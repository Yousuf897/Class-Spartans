package week_6.day_3;

public class PasswordCheck {

    /*
    Password Check

    Objective: To verify if a provided password matches a stored password.

    Your system has a stored password: String storedPassword = "JavaRocks";.
    A user tries to log in and provides a password:
    String enteredPassword = "JavaRules"; (This value can be changed for testing).
    Check if the entered password matches the stored password.
    Print out if the login is successful or not.

*/

    public static void main(String[] args) {
        String storedPassword = "JavaRocks";
        String enteredPassword = "JavaRocks";

        if ( storedPassword.equals(enteredPassword)) System.out.println("login is successful");
        else System.out.println("login faild!");


    }


}
