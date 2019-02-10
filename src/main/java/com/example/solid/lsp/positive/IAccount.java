package com.example.solid.lsp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public interface IAccount {

    /**
     * Withdraw $amount of money from this account if its balance is enough.
     * Otherwise do nothing
     *
     * @param amount
     * @throws Exception
     */
    void withdraw(Long amount);

    boolean isEnoughMoney(Long amount);
}
