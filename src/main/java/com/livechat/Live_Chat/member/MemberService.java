package com.livechat.Live_Chat.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public void create(String username, String password, String nickname) {
        Member m = new Member();
        m.setUsername(username);
        m.setPassword(password);
        m.setNickname(nickname);
        m.setRole(MEMBER_ROLE.USER);
        m.setCreateDate(LocalDateTime.now());
        m.setUpdateDate(LocalDateTime.now());

        this.memberRepository.save(m);
    }

}
