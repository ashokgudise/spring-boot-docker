package com.shipyard.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashokgudise on 2/8/17.
 */
@SpringBootApplication
@RestController
public class BootApp {

    @RequestMapping("/")
    public String home(){
        return "Hello from Docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApp.class, args);

    }
}
