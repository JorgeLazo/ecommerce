package com.jorgelazo.order.client;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallback implements UserClient {

    @Override
    public List<Object> getUsers() {
        return List.of(
                "fallback-user-service-unavailable"
        );
    }
}