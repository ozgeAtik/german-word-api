package com.german.german_word_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/selam")
    public String sayHello(){
        return "Hallo! Spring boot is working.";
    }
}
