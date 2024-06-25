package week_13.day_1;

public class VehicleRunner {

    public static void main(String[] args) {

        var bmwM4 = new BMW("M4", 280, "Competition");
        var bmwM3 = new BMW("M3", 220, "Competition");

        bmwM4.printVehicleInfo();
        bmwM3.printVehicleInfo();

        // System.out.println(BMW.numberOfTypes); // Cannot access because numberOfTypes declared as private


    }

}
