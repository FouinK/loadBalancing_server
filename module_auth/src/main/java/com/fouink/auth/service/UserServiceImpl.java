package com.fouink.auth.service;


import com.fouink.auth.dto.UserJoinRequestApi;
import com.fouink.auth.entity.UserInfo;
import com.fouink.auth.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public UserInfo join(UserJoinRequestApi userJoinRequestApi) {
        String getUsername = userJoinRequestApi.getUsername();

        if (userRepository.existsByUsername(getUsername)) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }

        String getPassword = passwordEncoder.encode(userJoinRequestApi.getPassword());
        String getNickname = userJoinRequestApi.getNickname();

        UserInfo userInfo = UserInfo.createUserInfo(getUsername, getPassword, getNickname);

        userRepository.save(userInfo);

        return userInfo;
    }
}
