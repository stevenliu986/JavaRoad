package com.javalearning.reflect;

public class Order {

    private String orderNo;
    private double price;
    private int quantity;
    private String orderStatus;

    public Order() {
    }

    public Order(String orderNo) {
        this.orderNo = orderNo;
    }

    public Order(String orderNo, double price) {
        this.orderNo = orderNo;
        this.price = price;
    }

    public Order(String orderNo, double price, int quantity) {
        this.orderNo = orderNo;
        this.price = price;
        this.quantity = quantity;
    }

    public Order(String orderNo, double price, int quantity, String orderStatus) {
        this.orderNo = orderNo;
        this.price = price;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}

