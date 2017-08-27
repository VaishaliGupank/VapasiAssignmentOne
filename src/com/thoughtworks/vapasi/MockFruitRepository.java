package com.thoughtworks.vapasi;

import java.util.HashMap;

public class MockFruitRepository implements IFruitRepository {

    static HashMap<String,OrderItem> priceTableForFruits;
    @Override
    public void populatePriceTableFruits() {
        priceTableForFruits = new HashMap<String,OrderItem>();
        priceTableForFruits.put("Apple", new OrderItem("Apple",100.0));
        priceTableForFruits.put("Orange", new OrderItem("Orange",80.0));
        priceTableForFruits.put("Banana", new OrderItem("Banana",30.0));
        priceTableForFruits.put("Kiwi", new OrderItem("Kiwi",120.0));

    }

    @Override
    public void addFruits(String fruitName, Double pricePerKg) {

        priceTableForFruits.put(fruitName, new OrderItem(fruitName, pricePerKg));

    }

    @Override
    public void removeFruits(String fruitName) {
        priceTableForFruits.remove(fruitName);
    }

    @Override
    public void showAllFruits() {
        System.out.println("Fruit Name" + " " + "Per kg rate");
        for (String key : priceTableForFruits.keySet()) {
            System.out.println(key + " " + priceTableForFruits.get(key).getPrice());
        }
    }

    public static Double getFruitPrice(String fruitName)
    {
        Double _fruit  = (Double) priceTableForFruits.get(fruitName).getPrice();
        return _fruit;
    }
}
