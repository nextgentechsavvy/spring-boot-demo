package com.nextgentechsavvy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="spring-boot-demo")
public class SpringBootDemoController {
    @GetMapping("/test-demo")
    public String testDemo(){
        return "Sample Spring Boot demo application using IntelliJ IDEA. Thanks";
    }
}
