package com.example.testtask.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/permit-all")
    public String permitAll() {
        return "this endpoint permit all";
    }

    @GetMapping("/for-users")
    public String forUsers() {
        return "this endpoint for Users";
    }

//    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/for-admin")
    public String forAdmin() {
        return "this endpoint for Admin";
    }
}
