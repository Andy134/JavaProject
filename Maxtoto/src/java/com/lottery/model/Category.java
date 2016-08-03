/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.model;

/**
 *
 * @author TuanAnh
 */
public class Category {
    private int catId;
    private String catName;
    private String catDesc;
    private String slug;
    private String path;

    /**
     * @return the catId
     */
    public int getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }

    /**
     * @return the catName
     */
    public String getCatName() {
        return catName;
    }

    /**
     * @param catName the catName to set
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * @return the catDesc
     */
    public String getCatDesc() {
        return catDesc;
    }

    /**
     * @param catDesc the catDesc to set
     */
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    /**
     * @return the slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug the slug to set
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
}
