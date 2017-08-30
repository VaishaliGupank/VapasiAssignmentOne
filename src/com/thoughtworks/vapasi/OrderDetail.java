package com.thoughtworks.vapasi;

public class OrderDetail {
    public int orderDetailId;
    public double quantity;
    public double totalPrice;
    public String fruit;
    public Order orderId;
    IOrderItemRepository _mockFruitRepo;

    public OrderDetail(IOrderItemRepository _mockFruitRepo)
    {
        this._mockFruitRepo = _mockFruitRepo;
    }

    public double calculateTotalPrice(String fruit, double quantity)
    {
        double totalPrice =  _mockFruitRepo.getFruitPrice(fruit) * quantity;
        return totalPrice;
    }

}
