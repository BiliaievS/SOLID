package com.example.solid.isp.positive;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class PdfReportTest {

    private IPdfReportable report;

    @Before
    public void setup() {
        report = new PdfReportGenerator();
    }

    @Test
    public void pdfReportTest(){
        report.generatePdf();
    }

}
