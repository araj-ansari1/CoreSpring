package com.app;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    @PostConstruct
    public void first(){
        System.out.println("After Component Has been Initilized ");
    }
    @PreDestroy
    public void last(){
        System.out.println("Before the object has been Destroy");
    }
}
