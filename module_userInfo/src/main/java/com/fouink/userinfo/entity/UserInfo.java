package com.fouink.userinfo.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserInfo extends BaseTimeEntity{
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String username;

    private String password;

    private String nickname;

    public static UserInfo createUserInfo(String username, String password, String nickname) {
        UserInfo userInfo = new UserInfo();
        userInfo.username = username;
        userInfo.password = password;
        userInfo.nickname = nickname;
        return userInfo;
    }
}
