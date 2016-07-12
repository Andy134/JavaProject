/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import Agency.Agency;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author tuananh
 */
public class JsonWorking {
    
    public void JsontoJava(){
         Gson gson = new GsonBuilder().create();
         //Agency a = gson.fromJson(reader, Person.class);
    }
}
