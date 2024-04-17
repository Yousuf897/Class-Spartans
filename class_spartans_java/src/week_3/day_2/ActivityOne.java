package week_3.day_2;

public class ActivityOne {

    /*
        I have total of 250 Apples and I have two friends named Tony and
        Alex.
        Each is going to take 50 apples.
        How many apples are left?

     */

    public static void main(String[] args) {
        int totalNumberOfApples = 250;

        totalNumberOfApples = totalNumberOfApples - 50; // 200
        totalNumberOfApples = totalNumberOfApples - 50; // 150

        System.out.println("You have " + totalNumberOfApples + " apples remaining.");

        System.out.println( totalNumberOfApples );

        totalNumberOfApples = totalNumberOfApples - 20; // 130

        System.out.println( totalNumberOfApples );
    }
}
