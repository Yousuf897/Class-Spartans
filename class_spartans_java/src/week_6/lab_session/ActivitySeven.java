package week_6.lab_session;

public class ActivitySeven {


    public static void main(String[] args) {

     boolean isTrue = false;

      isTrue = ( !( true || false && true && true && true ^ true && false || false && true )) ? true : false;

       if ( isTrue ) {
           System.out.println("Java");
       } else {
           System.out.println("Is Easy!");
       }


    }

}
