/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Agency.Agency;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Agency> agencyList;
        //ExcelWoring excelWorking = new ExcelWoring();
        //agencyList = excelWorking.readAgencyFromExcel();
        //for (int i = 0; i < agencyList.size(); i++) {
        //    System.out.println(agencyList.get(i).getDescription());
        //}
        //excelWorking.writeAgencyToExcel(agencyList);
        JsonWorking jsonWorking = new JsonWorking();
        agencyList = jsonWorking.JsontoJava();
        ExcelWoring excelWoring = new ExcelWoring();
        excelWoring.splitDescription(agencyList);
    }

}
