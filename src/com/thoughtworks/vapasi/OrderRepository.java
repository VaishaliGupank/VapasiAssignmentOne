package com.thoughtworks.vapasi;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IOrderRepository {

    public ShoppingCart _shoppingCart;
    Order _orderList ;

    @Override
    public void CreateOrder() {
        _orderList = new Order();
        _orderList.orderLines = new ArrayList<OrderDetail>();
        List<ShoppingCartItem> shoppingCartItems = _shoppingCart.shoppingCartItems;
        for (int i = 0; i < shoppingCartItems.size(); i++) {
            OrderDetail _orderDetails = new OrderDetail();
            _orderDetails.fruit = shoppingCartItems.get(i).fruit;
            _orderDetails.quantity = shoppingCartItems.get(i).quantity;
            _orderDetails.totalPrice = MockFruitRepository.getFruitPrice(shoppingCartItems.get(i).fruit) * shoppingCartItems.get(i).quantity;
            _orderList.orderLines.add(_orderDetails);

        }
        for (int i = 0; i < _orderList.orderLines.size(); i++)
        {
            _orderList.totalAmount = _orderList.totalAmount + _orderList.orderLines.get(i).totalPrice;
        }

    }

    @Override
    public void PrintOrder() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Fruit Name" + "  " + "Quantity" + "  " + "Price");
        for (int i = 0; i < _orderList.orderLines.size(); i++) {
            System.out.println(_orderList.orderLines.get(i).fruit + " " + _orderList.orderLines.get(i).quantity + " " + _orderList.orderLines.get(i).totalPrice);

        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Amount   " + _orderList.totalAmount);
    }


}
