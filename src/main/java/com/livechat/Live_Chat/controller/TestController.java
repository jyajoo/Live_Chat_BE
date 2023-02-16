package com.livechat.Live_Chat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/hello")
    public List<String> hello() {
        return Arrays.asList("안녕하세요", "Hello","되는거냐 맞냐");
}}
