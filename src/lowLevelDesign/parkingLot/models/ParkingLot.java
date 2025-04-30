package lowLevelDesign.parkingLot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLotInstance;
    private List<ParkingFloor> parkingFloors;

    private ParkingLot() {
        this.parkingFloors = new ArrayList<>();
    }

    public static ParkingLot getInstance(){
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot();
        }
        return parkingLotInstance;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(ParkingFloor floor : parkingFloors) {
            ParkingSpot spot = floor.getParkingSpot(vehicle.getVehicleType());
            if (spot != null) {
                spot.assignVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingFloor floor : parkingFloors) {
            ParkingSpot spot = floor.getParkingSpot(vehicle);
            if (spot != null && spot.getAssignedVehicle().equals(vehicle)) {
                spot.removeVehicle();
                return true;
            }
        }
        return false;
    }
}
