package ru.itsjava.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class FirstController {

    @GetMapping("/")
    public String getForAll() {
        return "index";
    }
}
