package com.example.solid.isp.positive;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 10/02/2019.
 */
public class ExcelReportTest {

    private IExcelReportable report;

    @Before
    public void setup() {
        report = new ExcelReportGenerator();
    }

    @Test
    public void pdfReportTest(){
        report.generateExcel();
    }

}
