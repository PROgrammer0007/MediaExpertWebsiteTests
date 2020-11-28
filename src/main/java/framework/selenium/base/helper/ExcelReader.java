package framework.selenium.base.helper;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ExcelReader {

    //method for file .xlsx
    public static Object[][] readExcelFile1(File file) throws IOException {

        InputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wordbook = new XSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers];

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue();
            }
        }
        return data;
    }

    //method for file .xls
    public static Object[][] readExcelFile2(File file) throws IOException {

        InputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wordbook = new HSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers];

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue();
            }
        }
        return data;
    }
}
