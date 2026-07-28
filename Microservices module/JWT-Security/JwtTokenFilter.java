package com.cognizant.jwt;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;

import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired

    private JwtTokenProvider jwtTokenProvider;

    @Override

    protected void doFilterInternal(HttpServletRequest request,

                                    HttpServletResponse response,

                                    FilterChain filterChain)

            throws ServletException, IOException {

        String token = resolveToken(request);

        if(token != null){

            // Sample exercise placeholder.
            // The uploaded material shows validation and authentication
            // but does not provide implementations of those methods.

        }

        filterChain.doFilter(request,response);

    }

    private String resolveToken(HttpServletRequest request){

        String bearerToken=request.getHeader("Authorization");

        if(bearerToken!=null && bearerToken.startsWith("Bearer ")){

            return bearerToken.substring(7);

        }

        return null;

    }

}