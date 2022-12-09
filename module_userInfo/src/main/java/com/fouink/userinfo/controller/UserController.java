package com.fouink.userinfo.controller;

import com.fouink.userinfo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/feignTest")
    public ResponseEntity<?> feignTest() {
        return ResponseEntity.ok(userService.feignRequestTest());
    }

}
