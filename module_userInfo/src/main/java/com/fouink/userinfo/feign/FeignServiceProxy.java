package com.fouink.userinfo.feign;

import com.fouink.userinfo.dto.HeaderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "testFeignClient", url = "http://localhost:8080//api/v1/auth", configuration = HeaderDto.class)
public interface FeignServiceProxy {

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    ResponseEntity<?> userJoinFeignTest(@RequestBody Map<String, String> map);
}
