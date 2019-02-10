package com.example.solid.ocp.negative;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 09/02/2019.
 */
public class MoneyTransferTest {

    private MoneyTransfer transfer;

    @Before
    public void setup() {
        transfer = new MoneyTransfer();
    }

    @Test
    public void wireTest() {
        transfer.setType(MoneyTransferType.WIRE);
        System.out.println(transfer.send());
    }

    @Test
    public void payPalTest() {
        transfer.setType(MoneyTransferType.PAYPAL);
        System.out.println(transfer.send());
    }

    @Test
    public void multChecksTest() {
        transfer.setType(MoneyTransferType.MULTIPLE_CHECKS);
        System.out.println(transfer.send());
    }
}
