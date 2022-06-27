package com.example.springproject2;

import com.example.springproject2.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProject2Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringProject2Application.class, args);

        Coder c1 = context.getBean(Coder.class);
        c1.setName("Lia");
        System.out.println(c1.getName());
        c1.petInfo();

        Coder c2 = context.getBean(Coder.class);
        c2.setName("Payel");
        System.out.println(c2.getName());
        c2.petInfo();
    }

}
