package week_11.day_2;

public class Runner {

    public static void main(String[] args) {

        // Create an object of Child
        var childObj = new Child("John", "Eric", "Alex");
        childObj.updateChildName("Eagle");
        childObj.printChildInfo();
        childObj.printChildNameUpdates();
        childObj.updateChildName("Something");
        childObj.printChildNameUpdates();



    }

}
