package com.automation.appium.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Excel_Read {

    public static void Excel() throws InterruptedException, IOException {
        //HSSFWorkbook workbook = null;
        // FileInputStream file = new FileInputStream("C:\\Users\\admin\\Intelij_workspace\\AppiumAutomation\\result\\bh.xlsx");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Intelij_workspace\\AppiumAutomation\\result\\bhavishya.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("sidi");

        Row row = sheet.createRow(0);
        Cell cell0 = row.createCell(0);
        cell0.setCellValue("Nav Value");

        Cell cell1 = row.createCell(1);

        cell1.setCellValue("Amount Change");

        Cell cell2 = row.createCell(2);
        cell2.setCellValue("Percent Change");

        workbook.write(fos);
        fos.flush();
        fos.close();
    }


    @Test
    public void excel() throws IOException, InterruptedException {
        Excel();
    }


}
