package week_12.day_1;

public class Runner {

    public static void main(String[] args) {

        var studentOne = new Student("Tony");
        var studentTwo = new Student("Eric");
        var studentThree = new Student("Trevor");

        // first Object
        studentOne.printStudentCount();
        studentOne.printStudentInfo();

        // Second Object
        studentTwo.printStudentCount();
        studentTwo.printStudentInfo();

        // Third object
        studentThree.printStudentCount();
        studentThree.printStudentInfo();



    }

}
