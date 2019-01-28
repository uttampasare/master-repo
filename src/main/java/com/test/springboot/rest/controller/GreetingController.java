package com.test.springboot.rest.controller;

import com.test.springboot.rest.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting show(@RequestParam(value = "name") String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
