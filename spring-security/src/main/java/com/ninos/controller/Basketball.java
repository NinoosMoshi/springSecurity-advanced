package com.ninos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basketball")
public class Basketball {

    @GetMapping("/start")
    public String start(){
        return "this is basketball";
    }

}
