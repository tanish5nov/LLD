package Problems.ParkingLot.AmountCalculation;

import Problems.ParkingLot.Tickets.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeBasedAmountCalculationStrategy implements AmountCalculationStrategies{
    @Override
    public Integer getFinalAmount(Ticket ticket) {
        Integer perHourCharge = 50;
        LocalDateTime entryTime = ticket.entryTime;
        LocalDateTime exitTime = LocalDateTime.now();
        Long timeDifferenceInMinutes = ChronoUnit.HOURS.between(entryTime, exitTime);
        return ticket.extraCharge + (Integer) timeDifferenceInMinutes.intValue() * perHourCharge;
    }
}
