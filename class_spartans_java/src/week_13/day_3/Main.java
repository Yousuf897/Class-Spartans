package week_13.day_3;
public class Main {
    public static void main(String[] args) {

        var studentOne = new Student("Tony", "Alexander", "02/05/1990");
        var studentTwo = new Student("Eric", "Morphy", "05/07/1987");
        var studentThree = new Student("Erin", "Something", "Something");

        System.err.println( studentOne.getFirstName() );
        System.err.println( studentTwo.getFirstName() );
        System.err.println( studentThree.getFirstName() );

        studentOne.printInfo();
        studentTwo.printInfo();
        studentThree.printInfo();
    }
}
