package com.livechat.Live_Chat.controller;

import com.livechat.Live_Chat.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequiredArgsConstructor
@RestController
public class JoinController {
    private final MemberService ms;

    @PostMapping("/join")
    public String joinMember(@RequestBody HashMap<String, String> param) {
        System.out.println("=================================");
//        System.out.println("id = " + userId);
//        System.out.println("pw = " + userPw);
//        System.out.println("nickName = " + userNickName);
        String id = param.get("userId");
        String pw = param.get("userPw");
        String nickName = param.get("userNickName");
        System.out.println("param = " + param);
        System.out.println("Id = " + id);
        System.out.println("Pw = " + pw);
        System.out.println("Nickname = " + nickName);

        System.out.println("=================================");
        //ms.create(id, pw, nickName);
        return nickName;
    }
}
