/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author tuananh
 */
public class Comic {
    // Basic Info
    private int comicId;
    private String comicUrl;
    private String comicTitle;
    private String comicLastUpdateTime;
    // Detail Info
    private int viewer;
    private String translator;
    private String author;
    private String[] category;
    private String readType;
    private String status;
    private String description;
    private String imageTitle;
    public Comic(){   
    }
    public Comic(int comicId,String imgTitle, int viewer, String translator, String author, String[] category, String readType, String status, String description){   
        this.comicId = comicId;
        this.imageTitle = imgTitle;
        this.viewer = viewer;
        this.translator = translator;
        this.author = author;
        this.category = category;
        this.readType = readType;
        this.status = status;
        this.description = description;
    }
    public  Comic(String comicUrl, String comicTitle, String comicLastUpdateTime){
        this.comicTitle = comicTitle;
        this.comicUrl = comicUrl;
        this.comicLastUpdateTime = comicLastUpdateTime;
    }
    public  Comic(int comicId, String comicUrl, String comicTitle, String comicLastUpdateTime){
        this.comicId = comicId;
        this.comicTitle = comicTitle;
        this.comicUrl = comicUrl;
        this.comicLastUpdateTime = comicLastUpdateTime;
    }
    
    /**
     * @return the id
     */
    public int getComicId() {
        return comicId;
    }

    /**
     * @param id the id to set
     */
    public void setComicId(int id) {
        this.comicId = id;
    }

    /**
     * @return the comicUrl
     */
    public String getComicUrl() {
        return comicUrl;
    }

    /**
     * @param comicUrl the comicUrl to set
     */
    public void setComicUrl(String comicUrl) {
        this.comicUrl = comicUrl;
    }

    /**
     * @return the comicTitle
     */
    public String getComicTitle() {
        return comicTitle;
    }

    /**
     * @param comicTitle the comicTitle to set
     */
    public void setComicTitle(String comicTitle) {
        this.comicTitle = comicTitle;
    }

    /**
     * @return the comicLastUpdateTime
     */
    public String getComicLastUpdateTime() {
        return comicLastUpdateTime;
    }

    /**
     * @param comicLastUpdateTime the comicLastUpdateTime to set
     */
    public void setComicLastUpdateTime(String comicLastUpdateTime) {
        this.comicLastUpdateTime = comicLastUpdateTime;
    }

    /**
     * @return the viewer
     */
    public int getViewer() {
        return viewer;
    }

    /**
     * @param viewer the viewer to set
     */
    public void setViewer(int viewer) {
        this.viewer = viewer;
    }

    /**
     * @return the translator
     */
    public String getTranslator() {
        return translator;
    }

    /**
     * @param translator the translator to set
     */
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the category
     */
    public String[] getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String[] category) {
        this.category = category;
    }

    /**
     * @return the readType
     */
    public String getReadType() {
        return readType;
    }

    /**
     * @param readType the readType to set
     */
    public void setReadType(String readType) {
        this.readType = readType;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the imageTitle
     */
    public String getImageTitle() {
        return imageTitle;
    }

    /**
     * @param imageTitle the imageTitle to set
     */
    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
    
    
}
