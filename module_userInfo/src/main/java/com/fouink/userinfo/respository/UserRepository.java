package com.fouink.userinfo.respository;

import com.fouink.userinfo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    boolean existsByUsername(String username);
}
