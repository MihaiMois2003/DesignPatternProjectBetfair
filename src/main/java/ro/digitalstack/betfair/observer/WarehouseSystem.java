package ro.digitalstack.betfair.observer;

import ro.digitalstack.betfair.model.Order;

public class WarehouseSystem implements OrderObserver{

    @Override
    public void update(Order order){
        System.out.println("""
                WAREHOUSE
                New task created for order: %s
                Items to process: %s
                Ship to: %s
                Current status: %s
                """.formatted(order.getCustomerName(), order.getItems(),
                order.getShippingAddress(), order.getStatus()));
    }
}
