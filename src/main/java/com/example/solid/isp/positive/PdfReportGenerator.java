package com.example.solid.isp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class PdfReportGenerator implements IPdfReportable {
    @Override
    public void generatePdf() {
        System.out.println("Run generate Pdf file");
    }

}
