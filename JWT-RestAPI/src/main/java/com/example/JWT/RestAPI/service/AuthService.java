package com.example.JWT.RestAPI.service;

import com.example.JWT.RestAPI.security.JwtUtil;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AuthService {

    public String generateToken(String username){
        String token = JwtUtil.generateToken(username);
        return token;
    }

    public String extractUsername(String token){
        String username = JwtUtil.extractUsername(token);
        return username;
    }

}
