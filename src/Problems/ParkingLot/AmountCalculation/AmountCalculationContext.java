package Problems.ParkingLot.AmountCalculation;

import Problems.ParkingLot.Tickets.Ticket;

public class AmountCalculationContext {
    public static AmountCalculationStrategies strategy = new TimeBasedAmountCalculationStrategy();
    public static void changeAmountCalculationStrategy(AmountCalculationStrategies newStrategy) {
        strategy = newStrategy;
    }
    public static Integer getAmount(Ticket ticket) {
        return strategy.getFinalAmount(ticket);
    }
}
