package com.thoughtworks.vapasi;

import java.util.HashMap;

public class MockFruitRepository implements IFruitRepository {

    static HashMap<String,Fruit> priceTableForFruits;
    @Override
    public void populatePriceTableFruits() {
        priceTableForFruits = new HashMap<String,Fruit>();
        priceTableForFruits.put("Apple", new Fruit("Apple",100));
        priceTableForFruits.put("Orange", new Fruit("Orange",80));
        priceTableForFruits.put("Banana", new Fruit("Banana",30));
        priceTableForFruits.put("Kiwi", new Fruit("Kiwi",120));

    }

    @Override
    public void addFruits(String fruitName, float pricePerKg) {

        priceTableForFruits.put(fruitName, new Fruit(fruitName,pricePerKg));

    }

    @Override
    public void removeFruits(String fruitName) {
        priceTableForFruits.remove(fruitName);
    }

    @Override
    public void showAllFruits() {
        System.out.println("Fruit Name" + " " + "Per kg rate");
        for (String key : priceTableForFruits.keySet()) {
            System.out.println(key + " " + priceTableForFruits.get(key).pricePerKg);
        }
    }

    public static Float getFruitPrice(String fruitName)
    {
        float _fruit  = (float) priceTableForFruits.get(fruitName).pricePerKg;
        return _fruit;
    }
}
