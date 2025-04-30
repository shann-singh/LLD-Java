package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.enums.EVehicle;

public class Truck extends Vehicle {

    Truck(String licenseNumber, EVehicle vehicleType) {
        super(licenseNumber, vehicleType);
    }
}
