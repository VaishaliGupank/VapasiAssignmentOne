package com.thoughtworks.vapasi;
import java.util.HashMap;

public interface IOrderItemRepository {
       void populatePriceTableFruits();
       void addFruits(String fruitName, Double pricePerKg);
       void removeFruits(String fruitName);
       void showAllFruits();
       Double getFruitPrice(String fruitName);

}
