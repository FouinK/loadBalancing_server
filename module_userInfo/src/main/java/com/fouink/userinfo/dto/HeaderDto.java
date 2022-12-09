package com.fouink.userinfo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
public class HeaderDto {
    @Value("${test.header}")
    private String testHeader;
}
