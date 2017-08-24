package com.thoughtworks.vapasi;
import java.util.HashMap;

public interface IFruitRepository {
       void populatePriceTableFruits();
       void addFruits(String fruitName, float pricePerKg);
       void removeFruits(String fruitName);
       void showAllFruits();
}
