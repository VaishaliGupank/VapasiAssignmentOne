package com.thoughtworks.vapasi;

import java.util.ArrayList;
import java.util.List;

public class Receipt  {

    public ShoppingCart shoppingCart;
    private Order order = new Order() ;
    IOrderItemRepository mockFruitRepo;
    public Receipt(ShoppingCart cart, IOrderItemRepository _mockFruitRepo)
    {
        this.shoppingCart = cart;
        this.mockFruitRepo = _mockFruitRepo;
    }

    public Order CreateOrder() {
        for (int i = 0; i < shoppingCart.shoppingCartItems.size(); i++) {
            OrderDetail orderItem = new OrderDetail(mockFruitRepo);
            orderItem.fruit = shoppingCart.shoppingCartItems.get(i).fruit;
            orderItem.quantity = shoppingCart.shoppingCartItems.get(i).quantity;
            orderItem.totalPrice =  orderItem.calculateTotalPrice( orderItem.fruit,orderItem.quantity);
            order.orderLines.add(orderItem);

        }
        for (int i = 0; i < order.orderLines.size(); i++)
        {
            order.totalAmount = order.totalAmount + order.orderLines.get(i).totalPrice;
        }
        return order;
    }




}

