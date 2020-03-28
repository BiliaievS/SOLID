package com.example.solid.lsp.negative;

public interface IAccount {

    /**
     * Withdraw $amount of money from this account if its balance is enough.
     *
     * @param amount -
     * @throws IllegalArgumentException - in case not enough money
     */
    void withdraw(Long amount);

    boolean isEnoughMoney(Long amount);
}
