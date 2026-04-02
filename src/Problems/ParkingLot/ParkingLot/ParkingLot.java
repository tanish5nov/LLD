package Problems.ParkingLot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> availableParkingSpots = new ArrayList<>();
    private List<ParkingSpot> occupiedParkingSpots = new ArrayList<>();
    private static ParkingLot parkingLotInstance = null;
    private ParkingLot(){};

    public static ParkingLot getInstance() {
        if(parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot();
        }
        return parkingLotInstance;
    }

    public void addParkingSpots(ParkingSpot parkingSpot) {
        if(occupiedParkingSpots.contains(parkingSpot)) {
            occupiedParkingSpots.remove(parkingSpot);
        }
        availableParkingSpots.add(parkingSpot);
    }

    public Boolean checkIfParkingSpotsAvailabe() {
        return !availableParkingSpots.isEmpty();
    }

    public ParkingSpot getParkingSpot() {
        if(availableParkingSpots.isEmpty()) {
            throw new RuntimeException("No Parking Spot Available");
        }
        else {
            ParkingSpot gettingOccupied = availableParkingSpots.getLast();
            availableParkingSpots.removeLast();
            occupiedParkingSpots.add(gettingOccupied);
            return gettingOccupied;
        }
    }

    public Integer getTotalParkingSpotsCount() {
        return availableParkingSpots.size() + occupiedParkingSpots.size();
    }
}
