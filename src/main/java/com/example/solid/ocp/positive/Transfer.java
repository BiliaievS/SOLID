package com.example.solid.ocp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class Transfer {

    private IMoneyTransfer moneyTransfer;

    public Transfer(IMoneyTransfer moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }

    public String greeting() {
        return moneyTransfer.send();
    }
}
