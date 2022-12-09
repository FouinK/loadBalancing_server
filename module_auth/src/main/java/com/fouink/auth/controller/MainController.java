package com.fouink.auth.controller;

import com.fouink.auth.dto.UserJoinRequestApi;
import com.fouink.auth.entity.UserInfo;
import com.fouink.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> userJoin(HttpServletRequest request, @RequestBody UserJoinRequestApi requestApi) {
        System.out.println(request.getHeader("testHeader"));

        UserInfo joinUserInfo = userService.join(requestApi);

        return ResponseEntity.ok(joinUserInfo);
    }
}
