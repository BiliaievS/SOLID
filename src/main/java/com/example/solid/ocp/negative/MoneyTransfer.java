package com.example.solid.ocp.negative;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class MoneyTransfer {

    private MoneyTransferType type;

    public void setType(MoneyTransferType type) {
        this.type = type;
    }

    public String send() {
        switch (type) {
            case WIRE:
                return "Send money by WIRE...";
            case PAYPAL:
                return "Send money by PayPal...";
            case MULTIPLE_CHECKS:
                return "Send money by Multiple Checks...";
            default:
                return "Send money by default...";
        }
    }
}
