package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.enums.EVehicle;

public class Car extends Vehicle {

    Car(String licenseNumber, EVehicle vehicleType) {
        super(licenseNumber, vehicleType);
    }
}
