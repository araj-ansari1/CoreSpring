package com.app;


import com.app.config.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
    Thread.sleep(2000);
    FirstBean firstBean=(FirstBean) context.getBean("first");
    context.close();
}
