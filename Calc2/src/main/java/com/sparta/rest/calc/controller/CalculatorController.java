package com.sparta.rest.calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(value="/sayhi")
    public String sayHi(){
        return "Hello from Spring!!!";
    }
}
