package com.app.config;

import com.app.FirstBean;
import com.app.SecondBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfiguration {
    @Bean
    @Lazy(value = true)
    public FirstBean firstBean(){
        return new FirstBean();
    }
    @Bean("second")
    public SecondBean secondBean(){
        return new SecondBean();
    }
}
