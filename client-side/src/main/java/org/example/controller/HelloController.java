package org.example.controller;

import org.example.feign.ServerSideFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private ServerSideFeign serverSideFeign;

    @GetMapping(value = "/hello/client/side")
    public String hello() {
        String hello = serverSideFeign.hello();
        System.out.println(hello);
        return "hello I am client side.";
    }
}
