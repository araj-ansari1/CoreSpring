package com.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class AppConfiguration {
    @Value("${student.name}")
    private String student;

    @Value("${teacher.name}")
    private String teacher;

    @Value("${company.name}")
    private String company;

    @Bean("Hello")
    public String showValues(){
        return "Student :: "+student+" || Teacher :: "+teacher+" || Company :: "+company;
    }
}
