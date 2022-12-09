package com.fouink.userinfo.service;

import com.fouink.userinfo.feign.FeignServiceProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private final FeignServiceProxy feignServiceProxy;

    public ResponseEntity<?> feignRequestTest() {
        Map<String, String> map = new HashMap<>();
        map.put("username", "username");
        map.put("password", "password");
        map.put("nickname", "nickname");

        return feignServiceProxy.userJoinFeignTest(map);
    }
}
