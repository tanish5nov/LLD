package Problems.ParkingLot.Gates;

import Problems.ParkingLot.ParkingLot.ParkingLot;
import Problems.ParkingLot.ParkingLot.ParkingSpot;
import Problems.ParkingLot.Tickets.SavedTickets;
import Problems.ParkingLot.Tickets.Ticket;
import Problems.ParkingLot.Vehicles.Vehicle;

import java.time.LocalDateTime;

public class EntryGate implements Gate{
    public String gateNumber;
    public EntryGate(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String getGateNumber() {
        return this.gateNumber;
    }

    private Ticket getTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = ParkingLot.getInstance().getParkingSpot();
        Ticket ticket = new Ticket(vehicle, LocalDateTime.now(), this, 0, parkingSpot);
        return ticket;
    }

    public void parkThisVehicle(Vehicle vehicle) {
        try {
            Ticket ticket = getTicket(vehicle);
            SavedTickets.saveTicket(vehicle, ticket);
            System.out.println("Vehicle Parked Successfully!!! " + vehicle.number + " from gate: " + ticket.gate.getGateNumber());
        } catch (RuntimeException e) {
            System.out.println("No spots available for Vehicle!!! " + vehicle.number);
        }
    }
}
