package com.thoughtworks.vapasi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         IOrderItemRepository _mockFruitRepository  = new MockFruitRepository();
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

        Receipt _orderRepository = new Receipt(_shoppingCart,_mockFruitRepository);
        Order printReceipt = _orderRepository.CreateOrder();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Fruit Name" + "  " + "Quantity" + "  " + "Price");
        for (int i = 0; i < printReceipt.orderLines.size(); i++) {
            System.out.println(printReceipt.orderLines.get(i).fruit + " " + printReceipt.orderLines.get(i).quantity + " " + printReceipt.orderLines.get(i).totalPrice);

        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Amount   " + printReceipt.totalAmount);




    }
}
