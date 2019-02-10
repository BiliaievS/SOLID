package com.example.solid.dip.positive;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class WritePrinter implements IWriter {

    public void printData(char ch) {
        System.out.println("printer print [" + ch + "]");
    }

}
