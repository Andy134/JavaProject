/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.utils.ConnectionPool;

/**
 *
 * @author tuananh
 */
public interface BaseService {

    public ConnectionPool getConnectionPool();

    public void releaseConnection();

    public void refreshConnectionPool();
}
