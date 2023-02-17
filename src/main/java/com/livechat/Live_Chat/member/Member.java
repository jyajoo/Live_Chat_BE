package com.livechat.Live_Chat.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;

    @Column(unique = true, length = 20)
    private String username;

    @Column(length = 16)
    private String password;

    @Column(unique = true)
    private String nickname;

    private MEMBER_ROLE role;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
