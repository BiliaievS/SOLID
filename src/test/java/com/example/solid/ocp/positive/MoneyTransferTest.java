package com.example.solid.ocp.positive;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 09/02/2019.
 */
public class MoneyTransferTest {

    private IMoneyTransfer transfer;

    @Before
    public void setup() {
    }

    @Test
    public void wireTest() {
        transfer = new WireTransfer();
        System.out.println(transfer.send());
    }

    @Test
    public void payPalTest() {
        transfer = new PayPalTransfer();
        System.out.println(transfer.send());
    }

    @Test
    public void multChecksTest() {
        transfer = new MultipleChecksTransfer();
        System.out.println(transfer.send());
    }
}
