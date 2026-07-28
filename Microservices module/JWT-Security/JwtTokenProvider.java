package com.cognizant.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    @Autowired

    private JwtConfig jwtConfig;

    public String createToken(String username){

        Claims claims = Jwts.claims().setSubject(username);

        Date now = new Date();

        Date validity = new Date(now.getTime()+3600000);

        return Jwts.builder()

                .setClaims(claims)

                .setIssuedAt(now)

                .setExpiration(validity)

                .signWith(SignatureAlgorithm.HS256,

                        jwtConfig.getSecret())

                .compact();

    }

}