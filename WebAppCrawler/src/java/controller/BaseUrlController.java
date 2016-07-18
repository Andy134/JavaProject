/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import contains.Contains;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BaseUrl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author tuananh
 */
public class BaseUrlController {

    public static Document doc;

    public boolean baseUrlConnect() {

        try {
                doc = Jsoup.connect(Contains.base_url).get();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(BaseUrlController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void getAllUrlLink() {
        
            Document listAll;
            try {
                listAll = Jsoup.connect(Contains.base_url+Contains.list_url).get();
                Elements questions = listAll.select("a[href] ");
                for (Element element : questions){
                    System.out.println(element);
                }
            } catch (IOException ex) {
                Logger.getLogger(BaseUrlController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
    }

    private static class ConsumerImpl implements Consumer<Element> {

        public ConsumerImpl() {
        }

        @Override
        public void accept(Element link) {
            System.out.println(link.attr("abs:href"));
        }
    }
}
