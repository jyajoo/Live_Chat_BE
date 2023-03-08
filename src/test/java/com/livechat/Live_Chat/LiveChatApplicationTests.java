package com.livechat.Live_Chat;

import com.livechat.Live_Chat.member.Member;
import com.livechat.Live_Chat.member.MemberRepository;
import com.livechat.Live_Chat.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LiveChatApplicationTests {

    @Autowired
    private MemberService m;
    @Autowired
    private MemberRepository mr;

    @Test
    void testH2() {

        m.create("47seo", "0105", "eunseo");
        m.create("teho", "0428", "teho");
        m.create("jya", "1234", "dmaolon");
    }

    @Test
    void test1() {
        List<Member> members = mr.findAll();
        for (Member member : members) {
            Member m = mr.findByNickname(member.getNickname());
            System.out.println("-------------------");
            System.out.println("m = " + m.toString());
            System.out.println("-------------------");
        }
    }

}
