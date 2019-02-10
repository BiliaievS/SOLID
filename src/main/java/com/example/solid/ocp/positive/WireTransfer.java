package com.example.solid.ocp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class WireTransfer implements IMoneyTransfer {
    @Override
    public String send() {
        return "Send money by WIRE...";
    }
}
