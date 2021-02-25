package com.example.springproone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringprooneApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(SpringprooneApplication.class, args);

        //Alien a=context.getBean(Alien.class);
        //a.show();
    }

}
