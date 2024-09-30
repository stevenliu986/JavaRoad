package com.springbootlearning.chapter04springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.springbootlearning.chapter04springboot3.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2024/9/30
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
