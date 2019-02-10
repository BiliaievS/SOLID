package com.example.solid.lsp.negative;

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

    @Test(expected = IllegalArgumentException.class)
    public void accountTest(){
        account.withdraw(100L);
    }
}
