package com.app;

import com.app.config.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstActivity {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
        String value=" " + context.getBean("Hello");
        System.out.println(value);
        context.close();
    }
}
