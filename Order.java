package com.example.myaeon2go;

public class Order {
    private String orderId;
    private String orderDate;
    private String orderItems;
    private String totalAmount;

    public Order(String orderId, String orderDate, String orderItems, String totalAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.totalAmount = totalAmount;
    }

    // Getters
    public String getOrderId() { return orderId; }
    public String getOrderDate() { return orderDate; }
    public String getOrderItems() { return orderItems; }
    public String getTotalAmount() { return totalAmount; }
}
