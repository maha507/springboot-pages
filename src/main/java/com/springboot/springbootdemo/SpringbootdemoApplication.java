package com.springboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	
	@GetMapping("/")
    public String print() {
        return "This page is first...";
    }
	@GetMapping("/hello")
    public String hello() {
        return "Hello, World!  welcome";
    }
	@GetMapping("/display")
    public String display() {
        return "Hello, World!  This is Display page";
    }

}
