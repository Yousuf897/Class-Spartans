package week_6.lab_session;

import java.util.Scanner;

public class ActivityOne {

/*
     Activity 01:
     Write a program that is going to check the username of the user and the password of the user
     if the username of the user is spartans and the password is equals to Spartans@123, then
     User should have the access to the system
     if the username matches and password don't
     user should not be granted access

     NOTE: User scanner to grab the userName and password of the user
*/

    public static void main(String[] args) {

        String userName = "spartans";
        String password = "Spartans@123";

        // Declare two variable to get the username and the password of user
        String userEnteredUserName;
        String userEnteredPassword;

        var scnObj = new Scanner(System.in);

        System.out.print("Please enter your UserName: ");
        userEnteredUserName = scnObj.next();

        System.out.print("Please enter your Password: ");
        userEnteredPassword = scnObj.next();

        if ( userEnteredUserName.equals(userName) && userEnteredPassword.equals(password) ) {
            System.out.println(" Access granted! ");
        } else  {
            System.out.println( " Invalid username or password, please try again! " );
        }


    }

}
