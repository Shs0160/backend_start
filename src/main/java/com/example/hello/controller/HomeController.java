package com.example.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Get Method
    @GetMapping("/")
    public String Home(){
        System.out.println("index");
        return "index";
    }

    @GetMapping("about")
    public String About(){
        System.out.println("about");
        return "about";
    }
}
