package week_1.day_3;

public class ClassExample {

    String firstName;

    void printFirstName() {
        System.out.println( firstName );
    }


    public static void main(String[] args) {

      //  System.out.println( firstName );
        ClassExample obj = new ClassExample();
        System.out.println( obj.firstName );
        // System.out.println( obj.printFirstName() );

    }

}
