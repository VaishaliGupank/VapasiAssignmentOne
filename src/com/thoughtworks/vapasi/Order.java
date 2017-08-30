package com.thoughtworks.vapasi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public int orderId;
    public List<OrderDetail> orderLines = new ArrayList<OrderDetail>();
    public Date orderPlaced;
    public double totalAmount;
}
