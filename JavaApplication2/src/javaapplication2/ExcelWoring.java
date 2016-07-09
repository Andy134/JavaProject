/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Agency.Agency;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author TuanAnh
 */
public class ExcelWoring {

    private static final String File_path = "C:\\Users\\TuanAnh\\workspace\\JavaLearning_workspace\\JavaApplication2\\src\\javaapplication2\\Dulieumoigioi.xlsx";

    public static List getAgencyFromExcel() {
        List agencyList = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(File_path);
            Workbook workBook = new XSSFWorkbook(fis);
            int numberOfSheets = workBook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workBook.getSheetAt(i);
                Iterator rowInterator = sheet.iterator();
                //iterating over each row
                while (rowInterator.hasNext()) {
                    Agency agency = new Agency();
                    Row row = (Row) rowInterator.next();
                    Iterator cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();
                        switch (cell.getColumnIndex()){
                        case 0: 
                            agency.setWebsite(cell.getStringCellValue());
                        case 1:
                            //agency.setFax(cell.getStringCellValue());
                        case 2:
                            agency.setName(cell.getStringCellValue());
                        case 3:
                            //agency.setMobile(mobileString);
                        case 4:
                            agency.setDescription(cell.getStringCellValue());
                        case 5:
                            //agency.setTaxId(cell.getStringCellValue());
                        case 6:
                            //agency.setPhone(cell.getStringCellValue());
                        case 7:
                            //agency.setAvatar(cell.getStringCellValue());
                        case 8:
                            //agency.setEmail(cell.getStringCellValue());
                        case 9:
                            //agency.setAddress(cell.getStringCellValue());
                        }
                            //agency.setName(cell.getStringCellValue());
                        agencyList.add(agency);
                    }
                }
            }
            fis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExcelWoring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExcelWoring.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agencyList;
    }

}
