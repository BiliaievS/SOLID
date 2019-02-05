package com.example.solid.dip.positive;

/**
 * Created by sbiliaiev on 3/6/2018.
 */
public class Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private IBasket basket;

    public Customer() {

    }

    public IBasket getBasket() {
        return basket;
    }

    public void setBasket(IBasket basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
