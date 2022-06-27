package com.example.springproject2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
@Component
@Scope (value="prototype")
public class Coder {
    public String name;
    @Autowired
    Dog dog;

    public Coder(){
        System.out.println("Coder Object Created");
    }

    public void petInfo (){
        dog.Info();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog Object Destroyed");
    }
}
