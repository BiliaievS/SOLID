package com.example.solid.isp.negative;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class ReportTest {

    private IReportable report;

    @Before
    public void setup() {
        report = new ReportGenerator();
    }

    @Test
    public void excelReportTest(){
        report.generateExcel();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void pdfReportTest(){
        report.generatePdf();
    }
}
