package Problems.ParkingLot.AmountCalculation;

import Problems.ParkingLot.Tickets.Ticket;

public interface AmountCalculationStrategies {
    public Integer getFinalAmount(Ticket ticket);
}
