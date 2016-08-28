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
import keyFilter.DescriptionKey;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
        row.createCell(cellIndex++).setCellValue("Image");
        //row.createCell(cellIndex++).setCellValue("Nội dung tự giới thiệu");
        row.createCell(cellIndex++).setCellValue("Tổng quan");
        row.createCell(cellIndex++).setCellValue("Chủ đầu tư");
        row.createCell(cellIndex++).setCellValue("Tiến độ");
        row.createCell(cellIndex++).setCellValue("Hạ tầng - Quy hoạch");
        row.createCell(cellIndex++).setCellValue("Bán hàng");
        row.createCell(cellIndex++).setCellValue("Vị trí");
        row.createCell(cellIndex++).setCellValue("Thiết kế - Mẫu nhà");

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
            row.createCell(cellIndex++).setCellValue(project.getImage());
            //row.createCell(cellIndex++).setCellValue(removeHtmlTags(project.getDescription().toString()));

            String removedHtmlTag = removeHtmlTags(project.getDescription().toString());
            ArrayList<DescriptionKey> desKeys = splitDescritonData(removedHtmlTag);
            /**
             * public DescriptionKey(){ desKey.add("Tổng quan=");
             * desKey.add("Chủ đầu tư="); desKey.add("Tiến độ");
             * desKey.add("Hạ tầng - Quy hoạch="); desKey.add("Bán hàng=");
             * desKey.add("Bán hàng="); desKey.add("Vị trí="); desKey.add("Thiết
             * kế - Mẫu nhà="); }
             */
            row.createCell(cellIndex++).setCellValue(desKeys.get(0).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(1).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(2).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(3).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(4).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(5).getDesKeyContent());
            row.createCell(cellIndex++).setCellValue(desKeys.get(6).getDesKeyContent());
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

    private String removeHtmlTags(String text) {

        Document doc = Jsoup.parse(text);

        return doc.text();

    }

    private ArrayList<DescriptionKey> splitDescritonData(String removedHtmlTag) {
        ArrayList<DescriptionKey> desKeys = new ArrayList<>();
        desKeys.add(new DescriptionKey("Tổng quan=", ""));
        desKeys.add(new DescriptionKey("Chủ đầu tư=", ""));
        desKeys.add(new DescriptionKey("Tiến độ=", ""));
        desKeys.add(new DescriptionKey("Hạ tầng - Quy hoạch=", ""));
        desKeys.add(new DescriptionKey("Bán hàng=", ""));
        desKeys.add(new DescriptionKey("Vị trí=", ""));
        desKeys.add(new DescriptionKey("Thiết kế - Mẫu nhà=", ""));
        int counter = 1;
        String tokenize = "//token";
        for (int i = 0; i < desKeys.size(); i++) {
            String desKeyContent = "";
            int startSubstring = 0, endSubstring = 0;
            String desKey = desKeys.get(i).getDesKey();
            if (removedHtmlTag.contains(desKey)) {
                startSubstring = removedHtmlTag.indexOf(desKey);
                String cutRemovedHtmlTag = removedHtmlTag.substring(startSubstring + desKey.length());
                

                endSubstring = replaceToken(tokenize, desKeys, cutRemovedHtmlTag);
                if (endSubstring > 0) {
                    desKeyContent = cutRemovedHtmlTag.substring(0, endSubstring);
                } else {
                    desKeyContent = cutRemovedHtmlTag;
                }
                desKeys.get(i).setDesKeyContent(desKeyContent);

            }
        }
        return desKeys;
    }

    private int replaceToken(String tokenize, ArrayList<DescriptionKey> desKeys, String cutRemovedHtmlTag) {
        for (int j = 0; j < desKeys.size(); j++) {
            String desKeyEnd = desKeys.get(j).getDesKey();
            if (cutRemovedHtmlTag.contains(desKeyEnd)) {
                cutRemovedHtmlTag = cutRemovedHtmlTag.replaceFirst(desKeyEnd, tokenize);
            }
        }
        int endSubstring = cutRemovedHtmlTag.indexOf(tokenize);
        return endSubstring;
    }
}
