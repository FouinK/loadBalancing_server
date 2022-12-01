package com.fouink.auth.service;

import com.fouink.auth.dto.UserJoinRequestApi;
import com.fouink.auth.entity.UserInfo;

public interface UserService {

    UserInfo join(UserJoinRequestApi userJoinRequestApi);

}
