package com.espazo.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?1
     * /user/1
     */
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value="/user/1", method = RequestMethod.GET)
//    @RequestMapping(vlaue="/user/1", method = RequestMethod.DELETE)
    @GetMapping("/hello")
    public String hello() {
        return "hello interface GET " + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "hello interface POST, " + name;
    }
}
