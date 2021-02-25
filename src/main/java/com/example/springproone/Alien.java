package com.example.springproone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/#/")
public class Alien {
    @GetMapping(path = "/yo")
    public String show(){
        //System.out.println("in alien class");
        return "helo world";
    }
}
