/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Project.Project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    private static final String File_input = "..\\DulieuDuAn\\src\\data\\DuLieuDuAn.xlsx";
    //private static final String FILE_output_fromJson = "..\\JavaApplication2\\src\\data\\Dulieumoigioi(Json_output).xlsx";
    private static final String FILE_output_splitDes = "..\\DulieuDuAn\\src\\data\\DuLieuDuAn(output).xlsx";
    
    public void agencyDocumentCreation(ArrayList<Project> projectList) {
        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();
        Sheet agencySheet = workbook.createSheet("Project");
        String des, scale, nameofagency, location, info;
        String stt, name, address, mobile, email, phone, website, city;
        
        int rowIndex = 0;
        Row row = agencySheet.createRow(rowIndex);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue("STT");
            row.createCell(cellIndex++).setCellValue("Fax");
            row.createCell(cellIndex++).setCellValue("Họ tên");
            row.createCell(cellIndex++).setCellValue("Điện Thoại");
            row.createCell(cellIndex++).setCellValue("Kinh độ (long)");
            row.createCell(cellIndex++).setCellValue("Vĩ độ (lat)");
            row.createCell(cellIndex++).setCellValue("Địa chỉ");
            row.createCell(cellIndex++).setCellValue("Email");
            row.createCell(cellIndex++).setCellValue("Nội dung tự giới thiệu");
        rowIndex = 1;
        for (Project project : projectList) {
            
            row = agencySheet.createRow(rowIndex++);
            cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(rowIndex); // STT
            row.createCell(cellIndex++).setCellValue(project.getFax());
            row.createCell(cellIndex++).setCellValue(project.getName());
            row.createCell(cellIndex++).setCellValue(project.getMobile());
            row.createCell(cellIndex++).setCellValue(project.getLocation().getLongtitude());
            row.createCell(cellIndex++).setCellValue(project.getLocation().getLatitude());
            row.createCell(cellIndex++).setCellValue(project.getAddress());
            row.createCell(cellIndex++).setCellValue(project.getEmail());
            row.createCell(cellIndex++).setCellValue("");
            
        }
        //write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(FILE_output_splitDes);
            workbook.write(fos);
            fos.close();
            System.out.println(FILE_output_splitDes + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
