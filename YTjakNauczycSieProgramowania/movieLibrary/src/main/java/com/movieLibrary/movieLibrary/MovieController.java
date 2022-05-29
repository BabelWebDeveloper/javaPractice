package com.movieLibrary.movieLibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/test")
    public String test() {
        return "Hello spring!";
    }
}
