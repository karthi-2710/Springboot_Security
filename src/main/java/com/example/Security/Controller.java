package com.example.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/get")
    public String get(){
        return "Demo";
    }

    @PreAuthorize(("hasRole('USER')"))
    @GetMapping("/user")
    public String user(){
        return "HI USER";
    }

    @PreAuthorize(("hasRole('ADMIN')"))
    @GetMapping("/admin")
    public String admin(){
        return "HI ADMIN";
    }


}