/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.utils.ConnectionPool;

/**
 *
 * @author tuananh
 */

public interface ShareConnectionManager {
    //
    public ConnectionPool  getConnection();
    // 
    public void releaseConnection();
    //
    public void refreshConnectionPool();
}
