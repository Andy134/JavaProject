/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Agency.Agency;
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

    private static final String File_input = "..\\JavaApplication2\\src\\data\\Dulieumoigioi.xlsx";
    //private static final String FILE_output_fromJson = "..\\JavaApplication2\\src\\data\\Dulieumoigioi(Json_output).xlsx";
    private static final String FILE_output_splitDes = "..\\JavaApplication2\\src\\data\\Dulieumoigioi(output).xlsx";
    public static ArrayList<Agency> readAgencyFromExcel() {
        ArrayList<Agency> agencyList = new ArrayList();
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
                    Agency agency = new Agency();
                    Row row = (Row) rowInterator.next();
                    Iterator cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();
                        switch (cell.getColumnIndex()) {
                            case 0:
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setWebsite(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setWebsite(cell.getNumericCellValue() + "");
                                }
                            case 1:
                                //agency.setFax(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setFax(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setFax(cell.getNumericCellValue() + "");
                                }
                            case 2:
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setName(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setName(cell.getNumericCellValue() + "");
                                }
                            case 3:
                                //agency.setMobile(mobileString);
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setMobile(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setMobile(cell.getNumericCellValue() + "");
                                }
                            case 4:
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setDescription(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setDescription(cell.getNumericCellValue() + "");
                                }
                            case 5:
                                //agency.setTaxId(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setTaxId(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setTaxId(cell.getNumericCellValue() + "");
                                }
                            case 6:
                                //agency.setPhone(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setPhone(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setPhone(cell.getNumericCellValue() + "");
                                }
                            case 7:
                                //agency.setAvatar(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setAvatar(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setAvatar(cell.getNumericCellValue() + "");
                                }
                            case 8:
                                //agency.setEmail(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setEmail(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setEmail(cell.getNumericCellValue() + "");
                                }
                            case 9:
                                //agency.setAddress(cell.getStringCellValue());
                                if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                    agency.setAddr(cell.getStringCellValue());
                                } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                    agency.setAddr(cell.getNumericCellValue() + "");
                                }
                        }
                        //agency.setName(cell.getStringCellValue());  
                    }
                    agencyList.add(agency);
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

    public void splitDescription(ArrayList<Agency> agencyList) {
        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();
        Sheet agencySheet = workbook.createSheet("Agency");
        String des, name;
        String scaleDelimit = "Khu vực";
        int scaleType = 0;
        String scaleType0 = "cá nhân môi giới";
        String scaleType1 = "công ty môi giới";
        String nameofagencyDelimit = "Nhà môi giới";
        String locationDelimit = "môi giới ở những khu vực sau:";
        String infoDelimit = "Thông tin cá nhân";
        String comIntroDelimit = "Giới thiệu công ty";
        int rowIndex = 0;
        for (Agency agency : agencyList) {
            des = agency.getDescription();
            name = agency.getName();
            // Split Scale information
            String scale;
            scale = des.replaceFirst(scaleDelimit, "").replaceFirst(nameofagencyDelimit + ".*", "");
            if (scale.substring(0, scale.length()).contains(scaleType0)) {
                // if scale is "ca nhan moi gioi" 
                scaleType = 0;
            } else {
                scale = scale.substring(0, scale.indexOf(".")+1);
                scaleType = 1;
            }
            scale = scale.replaceAll("^\\s+", "");
            // Split nameofagency information
            String nameofagency;
            if (scaleType == 0) {
                nameofagency = des.replaceFirst("(.*)" + nameofagencyDelimit, "").replaceFirst(locationDelimit + "(.*)", "");
            } else {
                nameofagency = name;
            }
            nameofagency = nameofagency.replaceAll("^\\s+", "");
            // Split location information
            String location;
            location = des.replaceFirst("(.*)" + locationDelimit, "");
            if (scaleType == 0) {
                location = location.replaceFirst(infoDelimit + "(.*)", "");
            } else {
                location = location.replaceFirst(comIntroDelimit + "(.*)", "");
            }
            location = location.replaceAll("^\\s+", "");
            location = location.replaceAll("(*.) ở ", "");
            
            //location = location.replaceAll("Cho thuê căn hộ chung cư ở ", "");
            
        
            
            
            
            // Split basic information
            String info;
            if (scaleType == 0) {
                info = des.replaceFirst("(.*)" + infoDelimit, "");
            } else {
                info = des.replaceFirst("(.*)" + comIntroDelimit, "");
            }
            info = info.replaceAll("^\\s+", "");

            Row row = agencySheet.createRow(rowIndex++);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(scale);
            row.createCell(cellIndex++).setCellValue(nameofagency);
            row.createCell(cellIndex++).setCellValue(location);
            row.createCell(cellIndex++).setCellValue(info);
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
/*
    public static void writeAgencyToExcel(ArrayList<Agency> agencyList) {
        Workbook workbook = new XSSFWorkbook();
        Sheet agencySheet = workbook.createSheet("Agency");
        int rowIndex = 0;

        for (Agency agency : agencyList) {

            Row row = agencySheet.createRow(rowIndex++);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(agency.getDescription());
            //row.createCell(cellIndex++).setCellValue(agency.getWebsite());
            //row.createCell(cellIndex++).setCellValue(agency.getFax());
            //row.createCell(cellIndex++).setCellValue(agency.getName());
            //row.createCell(cellIndex++).setCellValue(agency.getMobile());
            //row.createCell(cellIndex++).setCellValue(agency.getDescription());
            //row.createCell(cellIndex++).setCellValue(agency.getPhone());
            //row.createCell(cellIndex++).setCellValue(agency.getEmail());
        }
        //write this workbook in excel file.
        try (FileOutputStream fos = new FileOutputStream(FILE_output)) {
            workbook.write(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(FILE_output + " is successfully written");
    }
*/
// Method tao du lieu moi gioi
    public void agencyDocumentCreation(ArrayList<Agency> agencyList) {
        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();
        Sheet agencySheet = workbook.createSheet("Agency");
        String des, scale, nameofagency, location, info;
        String stt, name, address, mobile, email, phone, website, city;
        String scaleDelimit = "Khu vực";
        int scaleType = 0;
        String scaleType0 = "cá nhân môi giới";
        String scaleType1 = "công ty môi giới";
        String nameofagencyDelimit = "Nhà môi giới";
        String locationDelimit = "môi giới ở những khu vực sau:";
        String infoDelimit = "Thông tin cá nhân";
        String comIntroDelimit = "Giới thiệu công ty";
        int rowIndex = 0;
        Row row = agencySheet.createRow(rowIndex);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue("STT");
            row.createCell(cellIndex++).setCellValue("Loại hình");
            row.createCell(cellIndex++).setCellValue("Họ tên");
            row.createCell(cellIndex++).setCellValue("URL");
            row.createCell(cellIndex++).setCellValue("Địa chỉ");
            row.createCell(cellIndex++).setCellValue("Địa phương");
            row.createCell(cellIndex++).setCellValue("Điện thoại");
            row.createCell(cellIndex++).setCellValue("Di động");
            row.createCell(cellIndex++).setCellValue("Email");
            row.createCell(cellIndex++).setCellValue("Website");
            row.createCell(cellIndex++).setCellValue("Nội dung tự giới thiệu");
        rowIndex = 1;
        for (Agency agency : agencyList) {
            des = agency.getDescription();
            name = agency.getName();
            // DESCRIPTION
            // Split Scale information
           
            scale = des.replaceFirst(scaleDelimit, "").replaceFirst(nameofagencyDelimit + ".*", "");
            if (scale.substring(0, scale.length()).contains(scaleType0)) {
                // if scale is "ca nhan moi gioi" 
                scaleType = 0;
            } else {
                scale = scale.substring(0, scale.indexOf(".")+1);
                scaleType = 1;
            }
            scale = scale.replaceAll("^\\s+", "");
            // Split nameofagency information
            
            if (scaleType == 0) {
                nameofagency = des.replaceFirst("(.*)" + nameofagencyDelimit, "").replaceFirst(locationDelimit + "(.*)", "");
            } else {
                nameofagency = name;
            }
            nameofagency = nameofagency.replaceAll("^\\s+", "");
            // Split location information
            
            location = des.replaceFirst("(.*)" + locationDelimit, "");
            if (scaleType == 0) {
                location = location.replaceFirst(infoDelimit + "(.*)", "");
            } else {
                location = location.replaceFirst(comIntroDelimit + "(.*)", "");
            }
            location = location.replaceAll("^\\s+", "");
            // Split basic information
            
            if (scaleType == 0) {
                info = des.replaceFirst("(.*)" + infoDelimit, "");
            } else {
                info = des.replaceFirst("(.*)" + comIntroDelimit, "");
            }
            info = info.replaceAll("^\\s+", "");
            des = "Khu vực: "+scale+"\012";  
            des+= "Nhà môi giới: "+nameofagency+"\012";
            des+= "Môi giới ở những khu vực: "+ location+"\012";
            des+= "Thông tin cá nhân:\012"+ info;
            //OTHER INFORMATION
            address = agency.getAddr();
            phone = agency.getPhone();
            mobile = agency.getMobile();
            email = agency.getEmail();
            website = agency.getWebsite();
            // Split city
            String addressCode = address.toLowerCase();
            
            // Import to excel
            row = agencySheet.createRow(rowIndex++);
            cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(rowIndex++); // STT
            row.createCell(cellIndex++).setCellValue(scale);
            row.createCell(cellIndex++).setCellValue(name);
            row.createCell(cellIndex++).setCellValue("");
            row.createCell(cellIndex++).setCellValue(address);
            row.createCell(cellIndex++).setCellValue("");
            row.createCell(cellIndex++).setCellValue(phone);
            row.createCell(cellIndex++).setCellValue(mobile);
            row.createCell(cellIndex++).setCellValue(email);
            row.createCell(cellIndex++).setCellValue(website);
            row.createCell(cellIndex++).setCellValue(des);
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
