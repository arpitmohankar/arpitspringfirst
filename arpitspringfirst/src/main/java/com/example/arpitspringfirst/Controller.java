package com.example.arpitspringfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    public Dog dog;

    @GetMapping("/bark")
    public String bark(){
        return dog.bark();
    }
}
