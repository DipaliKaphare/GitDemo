package org.automation.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReader {

    public static String readExcel(String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resources/WebElements.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        return workbook.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
    }
}
