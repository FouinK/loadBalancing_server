package com.fouink.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.fouink.userinfo"})
public class UserInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoApplication.class, args);
    }

}
