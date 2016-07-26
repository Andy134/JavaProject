/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PageDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Page;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author tuananh
 */
public class PageController {

    public PageController() {

    } 

    public String getPageURL(int i){
        PageDao pageDao = new PageDao();
        String pageUrl = pageDao.callPageUrl().getPageUrl()+"page="+i;
        return pageUrl;
    }
    private void savingBaseUrl(String url){
        PageDao pageDao = new PageDao();
        if (pageDao.findPagebyUrl(url).getPageId() >= 0) {
            System.out.println("Base Url Existed");
        } else {
            Page page = new Page();
            page.setPageUrl(url);
            pageDao.addPage(page);
            System.out.println("Base Url created");
        }
        
    }
    public Document PageConnect() {       
        PageDao pageDao = new PageDao();
        Page pageUrl = pageDao.callPageUrl();
        String page = pageUrl.getPageUrl();
            try {
                Document doc = Jsoup.connect(page).get();
                
                return doc;
            } catch (IOException ex) {
                Logger.getLogger(PageController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }       
       return null;
    }
    
    
    
    public int getLastPage() {

        int lastPage = -1;
        if(PageConnect()!= null){
            Document doc = PageConnect();
            Elements pageClass = doc.select(".page");
            Element pageLast = pageClass.select("a[href]").last();
            lastPage = Integer.parseInt(pageLast.attr("data-page"));

            System.out.println("Lastpage:"+lastPage);
            return lastPage;
        }
        return lastPage;
    }
    
}
