package com.livechat.Live_Chat.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUsername(String userName);

    Member findByNickname(String nickName);
}

