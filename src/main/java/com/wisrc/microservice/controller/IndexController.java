package com.wisrc.microservice.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(description = "测试")
public class IndexController {

    @GetMapping(value = "/test")
    public Map<String, String> test() {
        Map<String, String> test = new HashMap<>();
        test.put("a", "a");
        test.put("b", "b");
        return test;
    }
}
