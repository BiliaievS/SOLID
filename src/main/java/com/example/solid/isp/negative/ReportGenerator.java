package com.example.solid.isp.negative;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class ReportGenerator implements IReportable {
    @Override
    public void generateExcel() {
        System.out.println("Run generate Excel file.");
    }

    @Override
    public void generatePdf() {
        throw new UnsupportedOperationException("This method is not implemented");
    }
}
