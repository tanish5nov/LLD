package Problems.ParkingLot.Tickets;

import Problems.ParkingLot.Gates.Gate;
import Problems.ParkingLot.ParkingLot.ParkingSpot;
import Problems.ParkingLot.Vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    public Vehicle vehicle;
    public LocalDateTime entryTime;
    public Gate gate;
    public Integer extraCharge;
    public ParkingSpot parkingSpot;
    public Ticket(Vehicle vehicle, LocalDateTime entryTime, Gate gate, Integer extraCharge, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.gate = gate;
        this.extraCharge = extraCharge;
        this.parkingSpot = parkingSpot;
    }
}
