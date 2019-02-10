package com.example.solid.dip.positive;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class CopyWorker {
    private final IReader reader;
    private final IWriter writer;

    public CopyWorker(IReader reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copy() {
        for (char ch : reader.getReadData()) {
            writer.printData(ch);
        }
    }
}
