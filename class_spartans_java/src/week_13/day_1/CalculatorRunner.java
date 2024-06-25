package week_13.day_1;

public class CalculatorRunner {

    public static void main(String[] args) {

        var calculatorObj = new Calculate();
        System.out.println(calculatorObj.sum(10, 30, 40) );
        System.out.println(calculatorObj.sum(10, 30) );

        String firstName = "john";
        System.out.println(firstName.replace('o', 'a'));
        System.out.println(firstName.replace("john", "Tony"));

//        firstName = firstName.replace("john", "Tony");
//        System.out.println( firstName );

    }
}
