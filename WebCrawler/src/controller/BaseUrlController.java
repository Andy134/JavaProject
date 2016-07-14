/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import contains.Contains;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BaseUrl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author tuananh
 */
public class BaseUrlController {
    public static Document doc;
    public boolean baseUrlConnect(){
        Contains contains = new Contains();
        try {
            doc = Jsoup.connect(contains.base_url).get();
            //System.out.println(doc);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(BaseUrlController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
