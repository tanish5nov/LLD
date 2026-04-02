package Problems.ParkingLot.Gates;

import Problems.ParkingLot.AmountCalculation.AmountCalculationContext;
import Problems.ParkingLot.ParkingLot.ParkingLot;
import Problems.ParkingLot.ParkingLot.ParkingSpot;
import Problems.ParkingLot.Tickets.SavedTickets;
import Problems.ParkingLot.Tickets.Ticket;
import Problems.ParkingLot.Vehicles.Vehicle;

import java.time.LocalDateTime;

public class ExitGate implements Gate{
    private String gateNumber;

    public ExitGate(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String getGateNumber() {
        return this.gateNumber;
    }

    private Ticket getSavedTicketForThisVehicle(Vehicle vehicle) {
        Ticket ticket = SavedTickets.getTicket(vehicle);
        return ticket;
    }

    public void unparkThisVehicle(Vehicle vehicle) {
        try {
            Ticket ticket = getSavedTicketForThisVehicle(vehicle);
            Integer amount = AmountCalculationContext.getAmount(ticket);

            ParkingSpot parkingSpot = ticket.parkingSpot;
            ParkingLot.getInstance().addParkingSpots(parkingSpot);

            System.out.println("Vehicle is out successfully!!! " + vehicle.number + " from gate: " + ticket.gate.getGateNumber());
        }
        catch (RuntimeException e) {
            System.out.println("Vehicle was not previously parked!!! " + vehicle.number);
        }
    }
}
