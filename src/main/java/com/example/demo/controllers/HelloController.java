package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller tager input fra brugeren og sætter de andre classes i gang
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("Hello")
    public String HelloWorld(){
        return "Hej venner" +
                "\ni dag er en god dag hihi";
    }
}
