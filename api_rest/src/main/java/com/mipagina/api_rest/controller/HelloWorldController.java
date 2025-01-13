package com.mipagina.api_rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String sayhello() {

        return "hello everyone, i am xavy";
    }
}
