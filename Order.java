package com.myaeon2go;

public class Order {
    private final String orderId;
    private final String date;
    private final String amount;
    private final String status;

    public Order(String orderId, String date, String amount, String status) {
        this.orderId = orderId;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getDate() { return date; }
    public String getAmount() { return amount; }
    public String getStatus() { return status; }
}
