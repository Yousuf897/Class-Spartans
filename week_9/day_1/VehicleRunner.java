package week_9.day_1;

public class VehicleRunner {

    public static void main(String[] args) {

        // Object of Vehicle Information
        var vehicleInfoObj = new VehicleInformation();
        vehicleInfoObj.vehicleCompany = "BMW";
        vehicleInfoObj.vehicleModel = "X7";
        vehicleInfoObj.vehicleTrim = "M60i";
        vehicleInfoObj.vehicleNumberOfDoors = 4;
        vehicleInfoObj.vehicleYear = 2024;
        vehicleInfoObj.printVehicleInformation();

        // Object of Second Vehicle Information
        var toyotaInformation = new VehicleInformation();
        toyotaInformation.vehicleCompany = "Toyota";
        toyotaInformation.vehicleModel = "Corolla";
        toyotaInformation.vehicleTrim = "XSE";
        toyotaInformation.vehicleNumberOfDoors = 4;
        toyotaInformation.vehicleYear = 2023;
        toyotaInformation.printVehicleInformation();

    }

}
