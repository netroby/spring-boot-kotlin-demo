package com.netroby.web.spring.demo   

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
  
    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "hello world"
    }
}

