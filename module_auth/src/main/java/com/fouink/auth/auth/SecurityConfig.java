package com.fouink.auth.auth;

import com.fouink.auth.filter.JwtAuthenticationFilter;
import com.fouink.auth.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final TokenService tokenService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
                .httpBasic().disable()
                .formLogin().disable()
                .addFilter(new JwtAuthenticationFilter(authenticationManager(), tokenService))
                .authorizeRequests()
                .anyRequest().permitAll();
    }

}
