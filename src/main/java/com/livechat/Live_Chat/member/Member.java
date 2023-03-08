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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Column(nullable = false, length = 16)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    private MEMBER_ROLE role;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", role=" + role +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
