package com.example.solid.lsp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public interface IAccount {
    void withdraw(Long amount) throws Exception;

    boolean isEnough(Long amount);
}
