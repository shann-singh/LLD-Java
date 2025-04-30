package lowLevelDesign.parkingLot.enums;

public enum EVehicle {
    CAR,
    BIKE,
    TRUCK;

    public SpotType getSpotType() {
        switch (this) {
            case CAR:
                return SpotType.CAR;
            case BIKE:
                return SpotType.BIKE;
            case TRUCK:
                return SpotType.TRUCK;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + this);
        }
    }
}
