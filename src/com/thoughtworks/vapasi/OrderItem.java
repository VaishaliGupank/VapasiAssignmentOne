package com.thoughtworks.vapasi;

public class OrderItem {
    String orderItem;
    private Double price;
    public OrderItem(String orderItem, Double price)
    {
        this.orderItem = orderItem;
        this.price = price;
    }

    public Double getPrice()
    {
        return price;
    }
}
