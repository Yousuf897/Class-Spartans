package week_6.lab_session;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String userName = "spartans", newUserName,
                password = "Spartans@123", newPassword;
        var sc = new Scanner(System.in);
        System.out.print("Enter your user Name: ");
        newUserName = sc.nextLine();
        System.out.print("Enter your Password: ");
        newPassword = sc.nextLine();
        if ((userName.equals(newUserName)) && (password.equals(newPassword))) {
            System.out.println("Access Granted");
        } else System.out.println("Wrong password or User Name");

    }
}
