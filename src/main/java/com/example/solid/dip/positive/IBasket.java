package com.example.solid.dip.positive;

public interface IBasket {

    String addOrder(String order);

    void deleteOrder(int orderId);

    int getOrderAmount();
}
