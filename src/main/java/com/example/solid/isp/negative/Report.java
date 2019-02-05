package com.example.solid.isp.negative;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class Report implements IReportable {
    @Override
    public void generateExcel() {
        System.out.println("Generate Excel file.");
    }

    @Override
    public void generatePdf() {
        System.out.println("Generate Pdf file.");
    }
}
