package com.app;

import com.app.comp.AppConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestingprojectApplication {
    public static void main(String args[]) throws Exception{
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
        MyComponent component=context.getBean(MyComponent.class);
    }
}
