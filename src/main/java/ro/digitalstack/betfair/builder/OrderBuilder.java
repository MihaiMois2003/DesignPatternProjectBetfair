package ro.digitalstack.betfair.builder;

import ro.digitalstack.betfair.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

    private String customerName;
    private String shippingAddress;
    private List<String> items = new ArrayList<>();
    private String paymentMethod;
    private String discountCode = "NONE";
    private boolean giftWrapping = false;

    public OrderBuilder customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder shippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderBuilder addItem(String item) {
        this.items.add(item);
        return this;
    }

    public OrderBuilder paymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public OrderBuilder discountCode(String discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public OrderBuilder giftWrapping(boolean giftWrapping) {
        this.giftWrapping = giftWrapping;
        return this;
    }

    public Order build() {
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalStateException("Order must have a customer name!");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("Order must have at least one item!");
        }
        return new Order(customerName, shippingAddress, items,
                paymentMethod, discountCode, giftWrapping);
    }
}
