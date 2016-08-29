/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelconvert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marker;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author TuanAnh
 */
public class Excelconvert {

    private static final String File_input = "..\\excelconvert\\src\\data\\maxtoto-coordinate.xlsx";
     public static ArrayList<Marker> readFromExcel() {
        ArrayList<Marker> markerList = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(File_input);
            Workbook workBook = new XSSFWorkbook(fis);
            int numberOfSheets = workBook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workBook.getSheetAt(i);
                Iterator rowInterator = sheet.iterator();
                // Remove title
                rowInterator.next();
                //iterating over each row
                while (rowInterator.hasNext()) {
                    Marker marker = new Marker();
                    Row row = (Row) rowInterator.next();
                    Iterator cellIterator = row.cellIterator();
                     String title = "";
                    while (cellIterator.hasNext()) {
                       
                        Cell cell = (Cell) cellIterator.next();
                        switch (cell.getColumnIndex()) {
                            case 0:
                                title = title + cell.getStringCellValue();
                                break;
                            case 1:
                                title = title +","+ cell.getStringCellValue();
                                break;
                            case 2:
                               title = title +","+ cell.getStringCellValue();
                               break;
                            case 3:
                                title = title +","+ cell.getStringCellValue();
                                break;
                            case 4:
                                title = title +","+ cell.getStringCellValue();
                                marker.setTitle(title);
                                break;
                            case 5:
                                break;
                            case 6:
                                //agency.setPhone(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    marker.setLon(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    marker.setLon(cell.getNumericCellValue() + "");
                                }
                                break;
                            case 7:
                                //agency.setAvatar(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    marker.setLat(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    marker.setLat(cell.getNumericCellValue() + "");
                                }
                                break;
                           
                        }
                        //agency.setName(cell.getStringCellValue());  
                    }
                    markerList.add(marker);
                }
            }
            fis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excelconvert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Excelconvert.class.getName()).log(Level.SEVERE, null, ex);
        }

        return markerList;
    }
}
