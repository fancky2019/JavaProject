package com.example.demoweb.controller;

import com.example.democommon.utility.JdbcHelper;
import com.example.democommon.utility.TestHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/fun1")
    public String fun1(String str) {

        return str;
    }
}
