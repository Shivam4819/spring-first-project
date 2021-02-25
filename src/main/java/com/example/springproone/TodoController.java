package com.example.springproone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(path = "/todos")
    public List<TodoUtils> getAll(){
        return service.findAll();
    }
}
