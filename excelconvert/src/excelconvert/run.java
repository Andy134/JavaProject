/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelconvert;

import java.io.IOException;
import java.util.ArrayList;
import model.Marker;

/**
 *
 * @author TuanAnh
 */
public class run {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Marker> agencyList;
        
        //JsonWorking jsonWorking = new JsonWorking();
        //agencyList = jsonWorking.JsontoJava();
        
        Excelconvert excelWoring = new Excelconvert();
        ArrayList<Marker> listMarker = excelWoring.readFromExcel();
        
        
        JsonOutput jsonOutput = new JsonOutput();
        String obj = jsonOutput.outputGeoJson(listMarker);
        
        System.out.println(obj);
       
    }

}
