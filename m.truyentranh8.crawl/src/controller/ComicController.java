/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ComicDao;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Comic;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author tuananh
 */
public class ComicController {

    public static final String loginTimeOutFile = "..\\m.truyentranh8.crawl\\logs\\pageConnectFail.json";

    public void AddNewAndUpdateAllComic() { // save comic base infomation
        PageController pageController = new PageController();
        Document doc = pageController.PageConnect();
        ComicDao comicDao = new ComicDao();
        if (doc != null) {
            int lastPage = pageController.getLastPage();
            ArrayList<String> dataUrls = new ArrayList<>();
            // Get all comic url.
            dataUrls = comicDao.getAllComicUrl();
            //  go from first to last page to get all data.
            for (int i = 1; i <= lastPage; i++) {
                String pageUrl = pageController.getPageURL(i);

                try {
                    Document page = Jsoup.connect(pageUrl).get();
                    Elements aPosts = page.select(".post");

                    for (Element aPost : aPosts) {
                        String links = aPost.attr("href");
                        String title = aPost.select(".title").first().text();
                        String lastUpdateString = aPost.select(".icontime").attr("datetime");
                        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        //Date lastUpdate = simpleDateFormat.parse(lastUpdateString);
                        //2016-05-14 01:05:57  yyyy-MM-dd HH:mm:ss
                        // check comic exist in databse or not.

                        if (!dataUrls.contains(links)) {
                            Comic comic = new Comic(links, title, lastUpdateString);
                            comicDao.addComic(comic);
                            System.out.println("Add new:" + title + " -- " + links);
                        } else {
                            int id = comicDao.findComicByUrl(links);
                            if (id >= 0) {
                                Comic comic = new Comic(id, links, title, lastUpdateString);
                                comicDao.updateComic(comic);
                                System.out.println("Update:" + title + " -- " + links);
                            }
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("Error-" + pageUrl);

                    Logger.getLogger(ComicController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Update finished");
        } else {
            System.out.println("Can not connect");
        }
    }

    public void UpdateDetailComic() {

        ComicDao comicDao = new ComicDao();
        ArrayList<String> comicUrls = comicDao.getAllComicUrl();
        for (String comicUrl : comicUrls) {
            Document comicDetailPage;
            try {
                comicDetailPage = Jsoup.connect(comicUrl).get();
               // Connect detail page
                if (comicDetailPage != null) {
                    Element comicInfo = comicDetailPage.select(".MangaInfo ").first();
                    String imgTitle = comicInfo.select("img.centered").first().attr("src");                   
                    int viewer = Integer.parseInt(comicInfo.select("p > b").first().text().replace(",",""));
                    
                    Element uTagInfo = comicInfo.select("ul").first();
                    String translator = uTagInfo.select("li:first-child > a > span").text();
                    String author = uTagInfo.select("li:nth-child(2) > a > span").text();
                    String[] category = new String[10];
                    
                    
                    System.out.println(uTagInfo.toString());
                    System.out.println("");
                }
            } catch (IOException ex) {
                Logger.getLogger(ComicController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
                Logger.getLogger(ComicController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
