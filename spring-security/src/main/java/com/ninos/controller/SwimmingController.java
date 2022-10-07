package com.ninos.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swimming")
public class SwimmingController {

    @DeleteMapping("/start")
    public String start(){
        return "this is swimming";
    }

}
