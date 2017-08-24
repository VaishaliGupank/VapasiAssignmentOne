package com.thoughtworks.vapasi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MockFruitRepository _mockFruitRepository = new MockFruitRepository();
        _mockFruitRepository.populatePriceTableFruits();
        _mockFruitRepository.showAllFruits();
	    /* Take input from the user */
	    ShoppingCart _shoppingCart = new ShoppingCart();
	    _shoppingCart.shoppingCartItems = new ArrayList<ShoppingCartItem>();
        ShoppingCartItem _shoppingCartItem1 = new ShoppingCartItem();
	    _shoppingCartItem1.fruit = "Apple";
	    _shoppingCartItem1.quantity = 2;
	    _shoppingCart.shoppingCartItems.add(_shoppingCartItem1);

        ShoppingCartItem _shoppingCartItem2 = new ShoppingCartItem();
        _shoppingCartItem2.fruit = "Orange";
        _shoppingCartItem2.quantity = 1.5f;
        _shoppingCart.shoppingCartItems.add((_shoppingCartItem2));

        ShoppingCartItem _shoppingCartItem3 = new ShoppingCartItem();
        _shoppingCartItem3.fruit = "Banana";
        _shoppingCartItem3.quantity = 0.5f;
        _shoppingCart.shoppingCartItems.add((_shoppingCartItem3));

        ShoppingCartItem _shoppingCartItem4 = new ShoppingCartItem();
        _shoppingCartItem4.fruit = "Kiwi";
        _shoppingCartItem4.quantity = 0.75f;
        _shoppingCart.shoppingCartItems.add((_shoppingCartItem4));

        OrderRepository _orderRepository = new OrderRepository();
        _orderRepository._shoppingCart = _shoppingCart;
        _orderRepository.CreateOrder();
        _orderRepository.PrintOrder();




    }
}
