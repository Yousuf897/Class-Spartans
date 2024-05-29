package week_9.day_2;


import week_9.day_1.MethodExample;


public class TestTwo {

    public static void main(String[] args) {


        // Access Non-static Members
       var methodObj = new MethodExample();
       methodObj.printMenuTwo();
       methodObj.printName();

       // Static Member
        MethodExample.printMenu();
        MethodExample.printFullName();
        MethodExample.firstName = " Joseph ";
        System.out.println(   MethodExample.firstName );

    }
}
