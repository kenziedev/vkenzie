package com.example.vkenzie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VkenzieApplication {

    @GetMapping("/")
    public String vkenzie(){
        return "v kenzie page";
    }
    public static void main(String[] args) {
        SpringApplication.run(VkenzieApplication.class, args);
    }

}
