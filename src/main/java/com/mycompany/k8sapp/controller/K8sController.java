package com.mycompany.k8sapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class K8sController {

    @GetMapping("/greet")
    public String greetings(){
        return "Welcome to the world of Kubernetes!";
    }
}
