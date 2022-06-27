package com.example.springproject1.model;

import javax.annotation.PreDestroy;

public class Computer {

    private String brand;

    public Computer(){
        super();
        System.out.println("No arg cons/Comp");
    }
    public Computer(String brand){
        super();
        this.brand = brand;
        System.out.println("Arg cons/comp");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Comp obj destroyed");
    }
}
