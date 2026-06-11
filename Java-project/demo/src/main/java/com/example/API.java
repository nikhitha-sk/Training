// package Java-project.demo.src.main.java.com.example;
package com.example;

import java.sql.Connection;

public class API {
    private Connection connection;
    
    public API(){
        connection = Connecting.getConnect();
    }
    public void createTable(){
        
    }
}
