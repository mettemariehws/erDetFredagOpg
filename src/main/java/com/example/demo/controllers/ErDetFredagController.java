package com.example.demo.controllers;

import com.example.demo.services.ErDetFredafUdregner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErDetFredagController {

    ErDetFredafUdregner myCalc = new ErDetFredafUdregner();

    @ResponseBody
    @GetMapping("erdetfredag")
    public String fredagCalculator(){
        return myCalc.erDetFredag();
    }


}
