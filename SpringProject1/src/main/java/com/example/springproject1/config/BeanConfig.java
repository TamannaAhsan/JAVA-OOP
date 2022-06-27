package com.example.springproject1.config;

import com.example.springproject1.model.Coder;
import com.example.springproject1.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){
        Coder c1 = new Coder();
        c1.setName("Adam Khan");
        c1.setLanguage("Python");
        c1.setComputer(computer);
        return c1;
    }

    @Bean
    public Computer computer1 (){
        Computer com1 = new Computer();
        com1.setBrand("AMD");
        return com1;
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){
        Coder c2 = new Coder();
        c2.setName("Abir Khan");
        c2.setLanguage("JAVA");
        c2.setComputer(computer);
        return c2;
    }

    @Bean
    public Computer computer2 (){
        Computer com2 = new Computer();
        com2.setBrand("HP");
        return com2;
    }

    @Bean
    public Coder coder3 (@Qualifier("computer2")Computer computer){
        Coder c3 = new Coder(1005,"Shahida","Java",computer);
        return c3;
    }
}
