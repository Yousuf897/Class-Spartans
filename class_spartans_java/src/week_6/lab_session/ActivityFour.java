package week_6.lab_session;

public class ActivityFour {

 /*
    * Age Group Classification

    Objective: Classify individuals into age groups based on their age.

    You're designing a system that categorizes individuals into age groups:
    *  Child (0-12),
    * Teenager (13-19),
    * and Adult (20 and above).
    A user provides their age: int userAge = 15; (This value can be changed for testing).
    Determine the user's age group.
    Print out the age group of the user.
    *
* */

    public static void main(String[] args) {

        int userAge = -1;
        int ageCategory;

        if (userAge >= 0 ) {
            if (userAge <= 12) System.out.println("Child (0-12)");
            else if (userAge <= 19) System.out.println("Teenager (13-19)");
            else System.out.println("Adult (20 and above)");
        } else {
            System.out.println("Invalid entry");
        }

        System.out.println( " * * * * *  * * * * *  * * * * *  " );

       ageCategory =  ( userAge >= 20 ) ? 2 : ( userAge >= 13 ) ? 1 : 0;


        if (userAge >= 0 ) {
            switch (ageCategory) {
                case 0:
                    System.out.println("Child (0-12)");
                    break;
                case 1:
                    System.out.println("Teenager (13-19)");
                    break;
                case 2:
                    System.out.println("Adult (20 and above)");
                    break;
                default:
                    System.out.println("Invalid age value!)");
            }
        } else {
            System.out.println("Invalid entry");
        }


    }


}
