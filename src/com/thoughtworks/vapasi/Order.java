package com.thoughtworks.vapasi;

import java.util.Date;
import java.util.List;

public class Order {
    public int orderId;
    public List<OrderDetail> orderLines;
    public Date orderPlaced;
    public double totalAmount;
}
