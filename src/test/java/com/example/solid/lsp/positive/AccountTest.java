package com.example.solid.lsp.positive;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 09/02/2019.
 */
public class AccountTest {

    private IAccount account;

    @Before
    public void setup() {
        account = new DefaultAccount();
    }

    @Test
    public void accountTest() {
        long money = 100L;
        if (account.isEnoughMoney(money)) {
            account.withdraw(money);
        }
    }
}
