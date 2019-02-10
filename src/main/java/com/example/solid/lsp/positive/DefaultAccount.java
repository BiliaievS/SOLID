package com.example.solid.lsp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class DefaultAccount implements IAccount {

    private Long balance = new Long(0);

    @Override
    public void withdraw(Long amount)  {
        balance -= amount;
    }

    public boolean isEnoughMoney(Long amount) {
        return balance >= amount;
    }
}
