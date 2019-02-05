package com.example.solid.dip.positive;

/**
 * Created by sbiliaiev on 3/6/2018.
 */
public class Basket implements IBasket {

    private int orderAmount;

    public int getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String addOrder(String order) {
        ++orderAmount;
        return order;
    }

    @Override
    public void deleteOrder(int orderId) {

    }
}
