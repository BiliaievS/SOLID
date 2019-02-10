package com.example.solid.dip.negative;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class CopyWorker {
    private final ReadKeyboard reader;
    private final WritePrinter writer;

    public CopyWorker(ReadKeyboard reader, WritePrinter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copy() {
        for (char ch : reader.getReadData()) {
            writer.printData(ch);
        }
    }
}
