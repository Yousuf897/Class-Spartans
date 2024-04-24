package week_4.day_2;

public class ContainsMethod {


    public static void main(String[] args) {

        String message = "is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println( message.contains("unchanged") ); // true // false
        System.out.println( message.contains("TekSchool") ); // true // false
        System.out.println( message.contains("changed") ); // true // false
        System.out.println( message.indexOf("changed") ); // 346
        System.out.println( message.substring(346) ); // 346
        System.out.println( message.charAt( 346 - 1 ) ); // 346
        //  346 -> changed
        // 346 - 1 --> 345 --> nchanged

        System.out.println( message.contains("change") ); //

        // unchanged
        // extract changed out of unchanges
        // extract change out of unchanged



    }

}
