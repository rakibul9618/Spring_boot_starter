package com.springboot.starter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @RequestMapping("/test")
    @ResponseBody
    public String helloWorld (){
        return "Hello its my first controller.";
    }
    @RequestMapping("/")
    public String home () {
        System.out.println("I am home route");
        return "home";
    }
}
