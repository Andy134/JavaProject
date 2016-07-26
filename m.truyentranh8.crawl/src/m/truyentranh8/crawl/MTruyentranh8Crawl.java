/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.truyentranh8.crawl;

import controller.ComicController;
import controller.PageController;
import dao.PageDao;
import model.Comic;
import model.Page;

/**
 *
 * @author tuananh
 */
public class MTruyentranh8Crawl {

    public static String baseUrl = "http://m.truyentranh8.net/all/";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PageController pageController = new PageController();
        //pageController.getLastPage();
        ComicController comicController = new ComicController();
        comicController.AddNewAndUpdateAllComic();
        //comicController.UpdateDetailComic();
    }
}
