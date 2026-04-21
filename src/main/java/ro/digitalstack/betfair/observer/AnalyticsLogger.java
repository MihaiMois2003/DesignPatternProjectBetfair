package ro.digitalstack.betfair.observer;

import ro.digitalstack.betfair.model.Order;

public class AnalyticsLogger implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("""
                    ANALYTICS 
                   Event recorded:
                   Customer: %s
                   Status changed to: %s
                   Items count: %d
                   Payment method: %s
                """.formatted(
                order.getCustomerName(),
                order.getStatus(),
                order.getItems().size(),
                order.getPaymentMethod()));
    }
}