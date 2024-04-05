package week_1.lab_session;

public class Employee {

        static String dateOfBirth;

        /*
         * TASK 04: Creating variables
         *
         * 1. Create an int variable called number;
         * 2. Create a String variable called firstName;
         * 3. Create a String variable called lastName;
         * 4. Create a String variable called middleName;
         * 5. Create a double variable called decimalNumber;
         *
         * */

        public static void main(String[] args) {

                // DataType label(name of variable)
                int number;
                String firstname;
                String lastName;
                String middleName;
                double decimalNumber;

                firstname = "John";
                lastName = "Doe";
                dateOfBirth = "10/10/1976";

                // John Doe
                System.out.println( firstname + " " + lastName + " " + dateOfBirth);
                System.out.println( firstname + " " + 2);
                System.out.println( 2 + " " + 2);
                System.out.println( 2 + 2);


        }

        public void method() {

        }

}
