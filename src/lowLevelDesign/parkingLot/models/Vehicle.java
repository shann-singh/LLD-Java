package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.enums.EVehicle;

public abstract class Vehicle {
    private String licenceNumber;
    private EVehicle vehicleType;

    public Vehicle(String licenseNumber, EVehicle vehicleType) {
        this.licenceNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public EVehicle getVehicleType() {
        return this.vehicleType;
    }
}
