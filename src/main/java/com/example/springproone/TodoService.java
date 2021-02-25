package com.example.springproone;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    private static List<TodoUtils> todos=new ArrayList();
    private static int counter=0;

    static {
        todos.add(new TodoUtils(++counter,"dannce",new Date(),false));
        todos.add(new TodoUtils(++counter,"msui",new Date(),false));
        todos.add(new TodoUtils(++counter,"dan",new Date(),false));
    }

    public List<TodoUtils> findAll(){
        return todos;
    }
}
