package com.example.springproone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
   @Autowired
    Laptop laptop;


    public void show(){
        System.out.println("in alien class");
        laptop.showLaptop();
    }
}
