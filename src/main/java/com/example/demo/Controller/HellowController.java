package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hellow World";
    }
    public int test(int a,int b){
        return  a+b;
    }
}
