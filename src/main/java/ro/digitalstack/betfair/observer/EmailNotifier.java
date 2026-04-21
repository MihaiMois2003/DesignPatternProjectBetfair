package ro.digitalstack.betfair.observer;

import ro.digitalstack.betfair.model.Order;

public class EmailNotifier implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("""
                EMAIl
                TO: %s
                Your status status has been updated to: %s
                """.formatted(order.getCustomerName(), order.getStatus()));
    }
}