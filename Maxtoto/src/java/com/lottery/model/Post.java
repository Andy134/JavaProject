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
public class Post implements java.io.Serializable{
    private int postId;
    private String postName;
    private Category category;
    private User user;
    private String postContent;
    private String postSlug;
    private Date publishDate;
    private Date lastEdit;
    private String Image;
    private int numView;
    private int status;

    /**
     * @return the postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * @param postId the postId to set
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     * @return the postName
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName the postName to set
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the postContent
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     * @param postContent the postContent to set
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    /**
     * @return the postSlug
     */
    public String getPostSlug() {
        return postSlug;
    }

    /**
     * @param postSlug the postSlug to set
     */
    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
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

    /**
     * @return the Image
     */
    public String getImage() {
        return Image;
    }

    /**
     * @param Image the Image to set
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * @return the numView
     */
    public int getNumView() {
        return numView;
    }

    /**
     * @param numView the numView to set
     */
    public void setNumView(int numView) {
        this.numView = numView;
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
}
