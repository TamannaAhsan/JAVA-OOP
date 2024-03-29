package com.example.springproject1.model;

import javax.annotation.PreDestroy;

public class Coder {

    private int id;
    private String name;
    private String language;
    private Computer computer;

    public Coder(){
        super();
        System.out.println("No arg cons/coder");
    }
    public Coder (int id, String name, String language, Computer computer){
        super();
        this.id = id;
        this.name = name;
        this.language = language;
        this.computer = computer;
        System.out.println("Arg cons/coder");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Coder obj destroyed");
    }
}




