package com.css.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrloller {

    @RequestMapping("info")
    public  String info(){
    return  "Hello Spring";
    }
}
