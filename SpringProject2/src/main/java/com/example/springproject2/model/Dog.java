package com.example.springproject2.model;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
@Component
public class Dog {

    public Dog(){
        System.out.println("Dog Object Created");
    }
    public void Info(){
        System.out.println("This is a German Shephard Dog");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Dog Object Destroyed");
    }
}
