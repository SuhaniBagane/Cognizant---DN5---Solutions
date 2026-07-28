package com.cognizant.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean

    SecurityFilterChain filterChain(HttpSecurity http,

                                    JwtTokenFilter jwtTokenFilter)

            throws Exception {

        http

                .authorizeHttpRequests(auth->

                        auth.anyRequest().authenticated())

                .addFilterBefore(jwtTokenFilter,

                        UsernamePasswordAuthenticationFilter.class);

        return http.build();

    }

}