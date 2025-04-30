package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.enums.SpotType;

public class ParkingSpot {

    private int spotId;
    private SpotType spotType;
    private Vehicle parkedVehicle;
    private boolean isOccupied;

    ParkingSpot(int id, SpotType spotType) {
        this.spotId = id;
        this.spotType = spotType;
        isOccupied = false;
    }

    public int getId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getAssignedVehicle() {
        return parkedVehicle;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        if (!this.isOccupied) {
            this.parkedVehicle = vehicle;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public boolean removeVehicle() {
        if (isOccupied) {
            this.parkedVehicle = null;
            this.isOccupied = false;
            return true;
        }
        return false;
    }
}
