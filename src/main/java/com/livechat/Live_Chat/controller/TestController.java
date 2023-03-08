package com.livechat.Live_Chat.controller;

import com.livechat.Live_Chat.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final MemberService ms;

    @GetMapping("/test")
    public List<String> hello() {
        return Arrays.asList("안녕하세요", "Hello", "되는거잖아");
    }


}
