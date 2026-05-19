package com.jorgelazo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "user-service",
        fallback = UserFallback.class
)
public interface UserClient {

    @GetMapping("/users")
    List<Object> getUsers();
}