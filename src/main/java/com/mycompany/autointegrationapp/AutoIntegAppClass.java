package com.mycompany.autointegrationapp;

import java.io.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import org.apache.poi.hssf.*;
public class AutoIntegAppClass {

    /*public String settingsNameFile = null;

    public void setSettingsNameFile(String temp) {
        this.settingsNameFile = temp;
    }

    public String getSettingsNameFile() {
        return (this.settingsNameFile);
    }*/

    public static void main(String[] args) {
        /*try {
            FileInputStream fileInputStream = new FileInputStream(window.getSettingsNameFile());
            System.out.println("File '" + window.getSettingsNameFile() + "' has been opened successfully.");
            HSSFWorkbook inputWorkbook = new HSSFWorkbook(fileInputStream);
            FileOutputStream out = new FileOutputStream(new File("reportTextBook.xls"));
            HSSFSheet inputWorksheet = inputWorkbook.getSheet("Лист1");
            HSSFRow row1 = inputWorksheet.getRow(0);
            int numElements = 5;
            int counter = 0;
            double[] inputDataArray = new double[numElements];
            for (int i = 0; i < numElements; i++) {
                HSSFCell cell = row1.getCell((short) i);
                inputDataArray[i] = cell.getNumericCellValue();
                if (cell.getNumericCellValue() % 2 == 0) {
                    counter++;
                }
            }

            HSSFCell cellA1 = row1.getCell((short) 0);
             double a1Val = cellA1.getNumericCellValue();
             HSSFCell cellB1 = row1.getCell((short) 1);
             double b1Val = cellB1.getNumericCellValue();
             HSSFCell cellC1 = row1.getCell((short) 2);
             double c1Val = cellC1.getNumericCellValue();
             HSSFCell cellD1 = row1.getCell((short) 3);
             double d1Val = cellD1.getNumericCellValue();*/
            /*HSSFCell cellC1 = row1.getCell((short) 2);
             boolean c1Val = cellC1.getBooleanCellValue();
             HSSFCell cellD1 = row1.getCell((short) 3);
             Date d1Val = cellD1.getDateCellValue();
            HSSFWorkbook resultWorkbook = new HSSFWorkbook();
            HSSFSheet resultSheet = resultWorkbook.createSheet("Результирующий_Лист");

            HSSFRow resultRow = resultSheet.createRow(0);
            HSSFCell resultCell = resultRow.createCell(0);
            resultCell.setCellValue("Количество чётных чисел:");
            resultCell = resultRow.createCell(1);
            resultCell.setCellValue(counter);
            resultRow = resultSheet.createRow(1);
            resultCell = resultRow.createCell(0);
            resultCell.setCellValue("Количество нечётных чисел:");
            resultCell = resultRow.createCell(1);
            resultCell.setCellValue(numElements - counter);
            resultWorkbook.write(out);
            out.close();
            System.out.println("Report has been saved in 'reportTextBook.xls' file successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}

// Возможные варианты заполнения результируюего xls-файла.

/*Map<String, Object[]> resultData = new HashMap<String, Object[]>();
 resultData.put("1", new Object[] {"Emp No.", "Name", "Salary"});
 resultData.put("2", new Object[] {1d, "John", 1500000d});
 resultData.put("3", new Object[] {2d, "Sam", 800000d});
 resultData.put("4", new Object[] {3d, "Dean", 700000d});

 Set<String> keyset = resultData.keySet();
 int rownum = 0;
 for (String key : keyset) {
 HSSFRow row = resultSheet.createRow(rownum++);
 Object [] objArr = resultData.get(key);
 int cellnum = 0;
 for (Object obj : objArr) {
 HSSFCell cell = row.createCell(cellnum++);
 if(obj instanceof Date) 
 cell.setCellValue((Date)obj);
 else if(obj instanceof Boolean)
 cell.setCellValue((Boolean)obj);
 else if(obj instanceof String)
 cell.setCellValue((String)obj);
 else if(obj instanceof Double)
 cell.setCellValue((Double)obj);
 }
 }*/
