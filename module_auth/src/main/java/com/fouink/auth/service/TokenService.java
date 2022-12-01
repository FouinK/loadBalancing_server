package com.fouink.auth.service;

import com.fouink.auth.auth.Token;

public interface TokenService {
    Token generateToken(Long uid, String role);

    boolean verifyToken(String token);

    String getUid(String token);
}
