package week_6.day_3;

public class SecretCodeVerification {

    /*
    Question: Secret Code Verification

    Imagine you're building a basic security system.
    The system has a secret code stored: int secretCode = 1234;.
    A user tries to enter a code to gain access: int enteredCode = 5678;
    (You can change this value for testing).

    Check if the entered code matches the secret code.
    If the codes match, print "Access granted!" Otherwise, print "Access denied!".
    Also, determine if the entered code is definitely not the secret code and print a respective message.
*/

    public static void main(String[] args) {

        int secretCode = 1234;
        int enteredCode = 1234;

        if ( enteredCode == secretCode ) System.out.println("Access granted!");
        else System.out.println("Access denied!");

        if ( enteredCode != secretCode ) System.out.println("Access denied!");
        else System.out.println("Access granted!");




    }

}
