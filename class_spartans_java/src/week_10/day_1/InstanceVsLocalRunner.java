package week_10.day_1;

public class InstanceVsLocalRunner {

    String lastName;

    public static void main(String[] args) {

        var obj = new InstanceVsLocalRunner();
        int number = 10;

        System.out.println( number );
        System.out.println( obj.lastName );
        obj.printFirstName();
    }

  //   System.out.println( number );
   void printFirstName() {
       System.out.println( lastName );
   }

    {
        System.out.println("java is easy " + lastName);
    }

}

