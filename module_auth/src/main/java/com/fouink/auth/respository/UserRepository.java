package com.fouink.auth.respository;


import com.fouink.auth.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    boolean existsByUsername(String username);

    Optional<UserInfo> findByUsername(String username);
}
