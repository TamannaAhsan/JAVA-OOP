package com.example.springproject1;

import com.example.springproject1.config.BeanConfig;
import com.example.springproject1.model.Coder;
import com.example.springproject1.model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({BeanConfig.class})
public class SpringProject1Application {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(SpringProject1Application.class, args);

       Coder code1 = (Coder) context.getBean("coder1");
       System.out.println(code1.getName());
       System.out.println(code1.getLanguage());
       System.out.println(code1.getComputer().getBrand());

        Coder code2 = (Coder) context.getBean("coder2");
        System.out.println(code2.getName());
        System.out.println(code2.getLanguage());
        System.out.println(code2.getComputer().getBrand());

        Coder code3 = (Coder) context.getBean("coder3");
        System.out.println(code3.getName());
        System.out.println(code3.getLanguage());
        System.out.println(code3.getComputer().getBrand());

    }

}
