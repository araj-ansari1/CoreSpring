package com.example.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
@Primary
public class OracleDataSource implements Datasource{
    @Override
    public String[] getEmails() {
        return new String[] {"manmohan@oracle.com","bhagat@oracle.com"};
    }
}
