package com.example.accountservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class HomeController {


    @GetMapping
    public String getData(){
        return "Hello Vengalarayudu I am from HCL";
    }


}
