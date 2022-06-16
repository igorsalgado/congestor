package com.example.igor.congestor.controller.dto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/ok")
    public String index() {
        return "Ok";
    }
}
