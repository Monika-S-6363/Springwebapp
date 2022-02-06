package com.remainder.Springwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/")
    public String hello()
    {
        return "HELLO WORLD.... HE HE";
    }
}
