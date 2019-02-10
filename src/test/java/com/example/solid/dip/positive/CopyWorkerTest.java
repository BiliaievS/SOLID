package com.example.solid.dip.positive;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class CopyWorkerTest {

    private CopyWorker worker;

    @Before
    public void before(){
        worker = new CopyWorker(new ReadKeyboard(), new WritePrinter());
    }

    @Test
    public void copyTest(){
        worker.copy();
    }
}
