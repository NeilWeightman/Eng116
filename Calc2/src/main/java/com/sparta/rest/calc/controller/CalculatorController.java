package com.sparta.rest.calc.controller;

import com.sparta.rest.calc.entities.CalcParams;
import com.sparta.rest.calc.entities.CalcResult;
import com.sparta.rest.calc.entities.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    @GetMapping(value="/sayhi")
    public Customer sayHi(@RequestParam String firstName,
                        @RequestParam String lastName,
                        @RequestParam int id){
        Customer cust = new Customer(firstName, lastName, id);
        return cust;
    }

    @GetMapping(value="add")
    public CalcResult add(@RequestParam int first, @RequestParam int second){
        CalcResult result = new CalcResult(first, second,
                "add", first + second);
        return result;
    }

    @PostMapping(value="add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public CalcResult addPost(@RequestBody CalcParams params){
        CalcResult result = new CalcResult(params.getParam1(), params.getParam2(),
                "add", params.getParam1() + params.getParam2());
        return result;
    }

    @GetMapping(value="calc/{p1}/add/{p2}")
    public CalcResult addURL(@PathVariable int p1, @PathVariable int p2){
        return new CalcResult(p1, p2, "add", p1 + p2);
    }
}
