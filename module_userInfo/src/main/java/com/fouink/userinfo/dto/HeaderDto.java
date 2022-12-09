package com.fouink.userinfo.dto;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
public class HeaderDto {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate ->
                requestTemplate.header("testHeader", "good");
    }
}
