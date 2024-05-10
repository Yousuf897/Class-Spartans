package week_6.lab_session;

public class ActivityFive {

/*
    Question: Age Verification for a Theme Park Ride

    A theme park ride has an age restriction. Only those who are 12 years old or older can go on the ride.
    A visitor wants to try the ride and provides their age:
    int visitorAge = 10; (This value can be changed for testing).
    Check the visitor's age against the age restriction.

    Determine:
    If the visitor is old enough for the ride.
    If the visitor is too young.
    Print out whether the visitor can go on the ride or not.

*/

    public static void main(String[] args) {

        int restriction = 12;
        int visitorAge = 13;
        boolean isVisitorAllowed;

        if ( visitorAge >= restriction ) System.out.println("You can navigate to park!");
        else System.out.println("Too young, you cannot navigate to park!");

        // Using ternary operator
        isVisitorAllowed = ( visitorAge >= restriction ) ? true : false;

        if ( isVisitorAllowed ) System.out.println("You can navigate to park!");
        else System.out.println("Too young, you cannot navigate to park!");


    }

}
