package com.example.solid.isp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class ExcelReportGenerator implements IExcelReportable {
    @Override
    public void generateExcel() {
        System.out.println("Run generate Excel file");
    }

}
