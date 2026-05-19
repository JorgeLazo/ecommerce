package com.jorgelazo.auth.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    private final SecretKey key =
            Keys.hmacShaKeyFor(
                    "supersecretkeysupersecretkey123456".getBytes()
            );

    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(
                        new Date(System.currentTimeMillis() + 3600000)
                )
                .signWith(key)
                .compact();
    }
}