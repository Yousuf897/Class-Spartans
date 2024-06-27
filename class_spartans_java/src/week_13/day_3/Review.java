package week_13.day_3;
public class Review {

    public static void main(String[] args) {

        var studentOne = new Test("Tony", "Alexander");
        var studentTwo = new Test("Eric", "Morphy");

        studentOne.printInfo();

        studentTwo.printInfo();

        System.out.println(studentOne.getCountStudent());
        System.out.println(studentTwo.getCountStudent());

    }

}
