package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfiguration.class)
public class AppConfigurationOne {
    @Bean("helloAgain")
    public String helloSecond(){
        return "Hello........Again!!!!";
    }
}
