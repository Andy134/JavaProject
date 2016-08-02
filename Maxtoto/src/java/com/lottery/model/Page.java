/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.model;

import java.util.Date;

/**
 *
 * @author TuanAnh
 */
public class Page {
    private int pageId;
    private String pageName;
    private String pageContent;
    private String pageSlug;
    private User user;
    private Date publishDate;
    private Date lastEdit;
    private int status;

    /**
     * @return the pageId
     */
    public int getPageId() {
        return pageId;
    }

    /**
     * @param pageId the pageId to set
     */
    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    /**
     * @return the pageName
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * @param pageName the pageName to set
     */
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    /**
     * @return the pageContent
     */
    public String getPageContent() {
        return pageContent;
    }

    /**
     * @param pageContent the pageContent to set
     */
    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    /**
     * @return the pageSlug
     */
    public String getPageSlug() {
        return pageSlug;
    }

    /**
     * @param pageSlug the pageSlug to set
     */
    public void setPageSlug(String pageSlug) {
        this.pageSlug = pageSlug;
    }

    /**
     * @return the userId
     */
    public User getUser() {
        return user;
    }

    /**
     * @param userId the userId to set
     */
    public void setUser(User user) {
        this.user = user;
    }

   

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the publishDate
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * @param publishDate the publishDate to set
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * @return the lastEdit
     */
    public Date getLastEdit() {
        return lastEdit;
    }

    /**
     * @param lastEdit the lastEdit to set
     */
    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }
    
    
}
