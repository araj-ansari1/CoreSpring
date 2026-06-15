package com.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class EmailService {
    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource _datasource){
        this.dataSource=_datasource;
    }
    public void sendMails(){
        String[] email=dataSource.getEmails();
        for(String emails:email){
            System.out.println(email);
        }
    }
}
