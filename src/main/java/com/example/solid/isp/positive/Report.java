package com.example.solid.isp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class Report implements IPdfReportable {
    @Override
    public void generatePdf() {
        System.out.println("Generate Pdf file. ");
    }
}
