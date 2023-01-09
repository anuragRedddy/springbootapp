package com.example.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {
    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable("a") double anurag,@PathVariable("b") double vamshi){
        return anurag+vamshi;

    }
}
