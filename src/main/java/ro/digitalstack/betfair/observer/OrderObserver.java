package ro.digitalstack.betfair.observer;

import ro.digitalstack.betfair.model.Order;

public interface OrderObserver {
    void update(Order order);
}