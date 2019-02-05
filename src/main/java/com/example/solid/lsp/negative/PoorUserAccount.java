package com.example.solid.lsp.negative;

/**
 * Created by sbiliaiev on 3/10/2018.
 */
public class PoorUserAccount implements IAccount {
    @Override
    public void withdraw(Long amount) throws IllegalStateException {
        throw new IllegalStateException("Not enough balance.");
    }
}
