package com.fouink.userinfo.service;

import com.fouink.userinfo.dto.UserJoinRequestApi;
import com.fouink.userinfo.entity.UserInfo;

public interface UserService {

    UserInfo join(UserJoinRequestApi userJoinRequestApi);

}
