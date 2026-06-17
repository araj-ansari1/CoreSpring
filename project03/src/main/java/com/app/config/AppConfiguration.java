package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean("hello")
    public String HelloBean(){
        return "Hello.......First Bean!!";
    }
}
