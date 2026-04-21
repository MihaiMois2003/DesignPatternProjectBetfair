package ro.digitalstack.betfair.shop;

import ro.digitalstack.betfair.model.Order;
import ro.digitalstack.betfair.model.OrderStatus;
import ro.digitalstack.betfair.observer.OrderObserver;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private final Order order;
    private final List<OrderObserver> observers = new ArrayList<>();

    public OrderManager(Order order) {
        this.order = order;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void updateStatus(OrderStatus newStatus) {
        order.setStatus(newStatus);
        System.out.println("  Order status changed to: " + newStatus);
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }

    public Order getOrder() {
        return order;
    }
}