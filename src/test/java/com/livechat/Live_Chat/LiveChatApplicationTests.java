package com.livechat.Live_Chat;

import com.livechat.Live_Chat.member.MemberRepository;
import com.livechat.Live_Chat.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LiveChatApplicationTests {

    @Autowired
    private MemberService m;
    private MemberRepository mr;

    @Test
    void testH2() {
        m.create("teho1", "12324", "qqwe");

    }

}
