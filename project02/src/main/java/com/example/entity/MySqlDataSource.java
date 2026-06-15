package com.example.entity;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlDataSource implements  Datasource{
    @Override
    public String[] getEmails() {
        return new String[] {"tanveer@mysql.com","eraj@mysql.com","vinay@mysql.com"};
    }
}
