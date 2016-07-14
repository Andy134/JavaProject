/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Agency.Agency;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author tuananh
 */
public class JsonWorking {

    private static final String File_json = "..\\JavaApplication2\\src\\data\\nhamoigioi_content.json";

    public ArrayList<Agency> JsontoJava() {
        //Gson gson = new GsonBuilder().create();
        //Agency a = gson.fromJson(reader, Person.class);
        ArrayList<Agency> agencyList = new ArrayList<>();
        try {
            //Reader reader = new InputStreamReader(JsonToJava.class.getResourceAsStream(File_json), "UTF-8")
            Gson gson = new Gson();
            FileReader file = new FileReader (File_json);
            
            
            //Reader reader = new FileReader(File_json);
            //InputStreamReader reader = new InputStreamReader(file, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(file) ;
            String jsonCustomize = "[";
            
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                line = line + ",";
                jsonCustomize += line;
            }
            jsonCustomize = jsonCustomize.substring(0, jsonCustomize.lastIndexOf(","));
            jsonCustomize += "]";
            
            
            
            agencyList = gson.fromJson(jsonCustomize, new TypeToken<ArrayList<Agency>>() {
            }.getType());
            
            removeHtmlTags(agencyList);
            return agencyList;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonWorking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JsonWorking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agencyList;
    }
    
    private void removeHtmlTags(ArrayList<Agency> agencyList){
        
        for(Agency agency : agencyList){
            String htmlDes = agency.getDescription();
            Document doc = Jsoup.parse(htmlDes);
            
            agency.setDescription(doc.text());
        }
       
    }
}
