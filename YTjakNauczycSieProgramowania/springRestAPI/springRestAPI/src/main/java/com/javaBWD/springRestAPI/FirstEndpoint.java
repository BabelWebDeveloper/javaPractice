package com.javaBWD.springRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEndpoint {

    @GetMapping("/test")
    public String getUser(){
        return "Hello World";
    }
}
