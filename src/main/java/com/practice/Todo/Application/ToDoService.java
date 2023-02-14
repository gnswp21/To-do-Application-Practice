package com.practice.Todo.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoService {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }
}
