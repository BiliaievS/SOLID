package com.example.solid.dip.positive;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class ReadKeyboard implements IReader  {

    char[] readData = {'p', 'o', 's', 'i', 't', 'i', 'v'};

    public char[] getReadData() {
        return readData;
    }
}
