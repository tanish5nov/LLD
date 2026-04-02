package Problems.ParkingLot.Tickets;

import Problems.ParkingLot.Vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SavedTickets {
    public static Map<Vehicle, Ticket> tickets = new HashMap<>();

    public static Ticket getTicket(Vehicle vehicle) {
        if(tickets.containsKey(vehicle)) {
            return tickets.get(vehicle);
        }
        throw new RuntimeException("No Ticket assigned to this Vehicle");
    }

    public static void saveTicket(Vehicle vehicle, Ticket ticket) {
        tickets.put(vehicle, ticket);
    }
}
