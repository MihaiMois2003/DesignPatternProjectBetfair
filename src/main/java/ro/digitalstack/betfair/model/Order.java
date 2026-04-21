package ro.digitalstack.betfair.model;

import java.util.List;

public class Order {

    private final String customerName;
    private final String shippingAddress;
    private final List<String> items;
    private final String paymentMethod;
    private final String discountCode;
    private final boolean giftWrapping;
    private OrderStatus status;

    public Order(String customerName, String shippingAddress, List<String> items,
                 String paymentMethod, String discountCode, boolean giftWrapping) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.discountCode = discountCode;
        this.giftWrapping = giftWrapping;
        this.status = OrderStatus.PLACED;
    }

    public String getCustomerName() { return customerName; }
    public String getShippingAddress() { return shippingAddress; }
    public List<String> getItems() { return items; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getDiscountCode() { return discountCode; }
    public boolean isGiftWrapping() { return giftWrapping; }
    public OrderStatus getStatus() { return status; }

    public void setStatus(OrderStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", items=" + items +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", discountCode='" + discountCode + '\'' +
                ", giftWrapping=" + giftWrapping +
                ", status='" + status + '\'' +
                '}';
    }
}
