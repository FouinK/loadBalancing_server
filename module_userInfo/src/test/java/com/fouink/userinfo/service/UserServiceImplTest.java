package com.fouink.userinfo.service;

import com.fouink.userinfo.dto.UserJoinRequestApi;
import com.fouink.userinfo.entity.UserInfo;
import com.fouink.userinfo.respository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceImplTest {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    EntityManager em;


    @Test
    @DisplayName("유저 회원가입 테스트")
    public void userJoinTest() {
        // given
        String username = "username";
        String password = "passowrd";
        String nickname = "nickname";
        UserJoinRequestApi userJoinRequestApi = new UserJoinRequestApi();
        userJoinRequestApi.setUsername(username);
        userJoinRequestApi.setPassword(password);
        userJoinRequestApi.setNickname(nickname);


        // when
        UserInfo userinfo = userService.join(userJoinRequestApi);
        em.flush();
        em.clear();

        // then
        UserInfo findUserInfo = userRepository.findById(userinfo.getId()).get();

        assertThat(findUserInfo.getUsername()).isEqualTo(username);

        try {
            userService.join(userJoinRequestApi);
        } catch (IllegalStateException e) {
            System.out.println("테스트 성공");
            return;
        }

        fail("예외가 발생해야합니다");
    }
}