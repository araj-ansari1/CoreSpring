package com.app;

import com.app.config.AppConfiguration;
import com.app.config.AppConfigurationOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstActivity {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfigurationOne.class);
        String first=" "+context.getBean("hello");
        String second=" "+context.getBean("helloAgain");

        System.out.println("First Value :: "+first);
        System.out.println("Second value :: "+second);
        context.close();
    }
}
