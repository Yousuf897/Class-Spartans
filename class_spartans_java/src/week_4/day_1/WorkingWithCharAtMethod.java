package week_4.day_1;

public class WorkingWithCharAtMethod {

    // charAt(): --> Will return specific character stored in a specific index. (Index = Address)

    // NOTE: How to get the last index of a message?? --> Use N - 1 formula.
    // Where N is the total length of your message. so if we say length() - 1 it will give us
    // the index of last character or simply the last index.

    public static void main(String[] args) {

        String fullName = "Eric Morphy";

        System.out.println( fullName.charAt(1) ); // r
        System.out.println( fullName.length() ); // print the total number of characters including spaces.
        System.out.println( fullName.length() - 1 ); // print the last index

    }

}
