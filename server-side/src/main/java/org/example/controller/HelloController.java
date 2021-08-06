package org.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PreAuthorize("hasAuthority('hello')")
    @GetMapping(value = "/hello/server/side")
    public String hello() {
        return "hello I am server side.";
    }
}
