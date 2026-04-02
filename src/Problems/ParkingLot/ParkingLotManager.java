package Problems.ParkingLot;

import Problems.ParkingLot.Gates.EntryGate;
import Problems.ParkingLot.Gates.ExitGate;
import Problems.ParkingLot.Vehicles.Vehicle;

public class ParkingLotManager {
    public static void parkVehicle(Vehicle vehicle, EntryGate entryGate) {
        entryGate.parkThisVehicle(vehicle);
    }

    public static void unparkVehicle(Vehicle vehicle, ExitGate exitGate) {
        exitGate.unparkThisVehicle(vehicle);
    }
}
