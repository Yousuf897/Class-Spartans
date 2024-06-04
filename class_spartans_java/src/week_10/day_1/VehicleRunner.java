package week_10.day_1;

public class VehicleRunner {
    public static void main(String[] args) {
        // Objects
        var vehicleOneObj = new Vehicle("BMW", "X7", "M60i", 4);
        var vehicleTwoObj = new Vehicle("Toyota", "Corolla", "XSE", 4);

        // Print Information of Vehicle
        vehicleOneObj.printVehicleInformation();
        vehicleTwoObj.printVehicleInformation();
    }
}

