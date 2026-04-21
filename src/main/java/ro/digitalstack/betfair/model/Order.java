package ro.digitalstack.betfair.model;

import java.util.List;

public class Order {

    private final String customerName;
    private final String shippingAddress;
    private final List<String> items;
    private final String paymentMethod;
    private final String discountCode;
    private final boolean giftWrapping;
    private String status;

    Order(String customerName, String shippingAddress, List<String> items,
          String paymentMethod, String discountCode, boolean giftWrapping) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.discountCode = discountCode;
        this.giftWrapping = giftWrapping;
        this.status = "PLACED";
    }

    public String getCustomerName() { return customerName; }





}
