package com.jorgelazo.auth.controller;

import com.jorgelazo.auth.service.JwtService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(
            JwtService jwtService
    ) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestBody Map<String, String> request
    ) {

        String token =
                jwtService.generateToken(
                        request.get("username")
                );

        return Map.of("token", token);
    }
}