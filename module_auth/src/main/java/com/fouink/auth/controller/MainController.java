package com.fouink.auth.controller;

import com.fouink.auth.dto.UserJoinRequestApi;
import com.fouink.auth.entity.UserInfo;
import com.fouink.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> userJoin(@RequestBody UserJoinRequestApi requestApi) {

        UserInfo joinUserInfo = userService.join(requestApi);

        return ResponseEntity.ok(joinUserInfo);
    }
}
