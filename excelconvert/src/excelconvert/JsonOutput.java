/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelconvert;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author TuanAnh
 */
public class JsonOutput {

    private static final String File_Output = "..\\excelconvert\\src\\data\\maxtotos.geojson";

    public String outputGeoJson(ArrayList<Marker> listMarker) throws IOException {
        JSONArray features = new JSONArray();
        for (int i = 0; i < listMarker.size(); i++) {
            JSONObject feature = new JSONObject();
            feature.put("type", "Feature");
            // Create geometry
            JSONObject geometry = new JSONObject();
            geometry.put("type", "Point");
            // coordiantes
            JSONArray coordinates = new JSONArray();
            if (listMarker.get(i).getLat() == null || listMarker.get(i).getLon() == null) {
                coordinates.add(0.0);
                coordinates.add(0.0);
            } else {
                coordinates.add(Double.parseDouble(listMarker.get(i).getLat()));
                coordinates.add(Double.parseDouble(listMarker.get(i).getLon()));
            }
            
            geometry.put("coordinates", coordinates);
            // End Create geometry
            feature.put("geometry", geometry);
            
            JSONObject properties = new JSONObject();
            
            properties.put("title", listMarker.get(i).getTitle());
            feature.put("properties", properties);
            
            features.add(feature);
        }
        JSONObject marker = new JSONObject();
        marker.put("type", "FeatureCollection");
        marker.put("features", features);
        exportJson(marker);
        return marker + "";
        
    }
    
    public void exportJson(JSONObject obj) throws IOException {
        FileWriter file = new FileWriter(File_Output);
        try {
            
            file.write(obj.toJSONString());
            System.out.println("Successfully copied");
        } catch (IOException ex) {
            Logger.getLogger(JsonOutput.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            file.flush();
            file.close();
        }
    }

}
