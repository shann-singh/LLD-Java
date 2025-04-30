package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.enums.EVehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public ParkingSpot getParkingSpot(EVehicle vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotType() == vehicleType.getSpotType() && spot.isOccupied() == false) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isOccupied() == true && spot.getAssignedVehicle().equals(vehicle)) {
                return spot;
            }
        }
        return null;
    }
}
