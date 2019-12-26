package com.nojava._01startspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot 练习第一个controller
 */
@RestController
public class HelloController {
    @RequestMapping("/first")
    public String index(){
        return "Greetings from Spring Boot!";
    }


}
