package week_9.day_2;

public class VehicleRunner {

    public static void main(String[] args) {

        // Create Object of Vehicle
        var bmwObj = new Vehicle();
        bmwObj.printVehicleInfo("BMW");

        // Create a new Object for another Vehicle
        var toyotaObj = new Vehicle();
        toyotaObj.printVehicleInfo("Toyota");

    }

}
