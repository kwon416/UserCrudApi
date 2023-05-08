package com.likelion.sample.controller;


import com.likelion.sample.dto.CalculatorRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int calculator(CalculatorRequest request) {
        return request.getNumber1() + request.getNumber2() + request.getNumber3();
    }

    @PostMapping("/multiply")
    public int calculatorPost(@RequestBody CalculatorRequest request) {
        return request.getNumber1() * request.getNumber2();
    }



}
