package com.automation.appium.ExcelResults;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import com.common.excelreport.ExcelReportGenerator;
import org.xml.sax.SAXException;
public class ExcelGenerate {

    public static void main(String[]args) throws ParserConfigurationException, IOException, SAXException
    {
        ExcelReportGenerator.generateExcelReport("New_Microsoft_Excel_Worksheet.xlsx1","E:\\Results");

    }
}