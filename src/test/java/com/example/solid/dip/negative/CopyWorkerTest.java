package com.example.solid.dip.negative;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class CopyWorkerTest {

    private CopyWorker copyWorker;

    @Before
    public void setup(){
        copyWorker = new CopyWorker(new ReadKeyboard(), new WritePrinter());
    }

    @Test
    public void copyTest(){
        copyWorker.copy();
    }
}
