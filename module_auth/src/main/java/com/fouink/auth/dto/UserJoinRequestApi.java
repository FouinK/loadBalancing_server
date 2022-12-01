package com.fouink.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinRequestApi {
    private String username;
    private String password;
    private String nickname;
}
