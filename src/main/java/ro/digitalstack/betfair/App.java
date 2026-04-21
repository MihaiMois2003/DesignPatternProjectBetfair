package ro.digitalstack.betfair;

import ro.digitalstack.betfair.builder.OrderBuilder;
import ro.digitalstack.betfair.model.Order;
import ro.digitalstack.betfair.model.OrderStatus;
import ro.digitalstack.betfair.observer.AnalyticsLogger;
import ro.digitalstack.betfair.observer.EmailNotifier;
import ro.digitalstack.betfair.observer.WarehouseSystem;
import ro.digitalstack.betfair.shop.OrderManager;

public class App {

    public static void main(String[] args) {


        Order order = new OrderBuilder()
                .customerName("Moise Mihai")
                .shippingAddress("Cluj Napoca")
                .addItem("Laptop")
                .addItem("Mouse")
                .addItem("Keyboard")
                .paymentMethod("Credit Card")
                .discountCode("SOTO")
                .giftWrapping(true)
                .build();

        System.out.println(order);
        System.out.println();

        OrderManager manager = new OrderManager(order);

        manager.addObserver(new EmailNotifier());
        manager.addObserver(new WarehouseSystem());
        manager.addObserver(new AnalyticsLogger());

        manager.updateStatus(OrderStatus.PROCESSING);
        manager.updateStatus(OrderStatus.SHIPPED);
        manager.updateStatus(OrderStatus.DELIVERED);
    }
}