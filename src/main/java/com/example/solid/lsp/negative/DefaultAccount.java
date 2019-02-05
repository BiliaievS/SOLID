package com.example.solid.lsp.negative;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class DefaultAccount implements IAccount {

    private Long balance;

    @Override
    public void withdraw(Long amount) {
        if (!isEnough(amount)) {
            throw new IllegalStateException();
        }
        balance -= amount;
    }

    private boolean isEnough(Long amount) {
        return balance >= amount;
    }
}
