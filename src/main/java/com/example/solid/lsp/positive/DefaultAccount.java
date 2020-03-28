package com.example.solid.lsp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class DefaultAccount implements IAccount {

    private Long balance = 0L;

    @Override
    public void withdraw(Long amount)  {
        balance -= amount;
    }

    public boolean isEnoughMoney(Long amount) {
        return balance >= amount;
    }
}
