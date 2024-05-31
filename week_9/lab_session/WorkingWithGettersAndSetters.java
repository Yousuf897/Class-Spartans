package week_9.lab_session;

public class WorkingWithGettersAndSetters {

    public static void main(String[] args) {

        var empObj = new Employee();
        empObj.setFirstName("John");
        empObj.setLastName("Doe");

        System.out.println( empObj.getFirstName() );
        System.out.println( empObj.getLastName() );

    }

}
