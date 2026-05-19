package com.jorgelazo.order.controller;

import com.jorgelazo.order.client.ProductClient;
import com.jorgelazo.order.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final UserClient userClient;
    private final ProductClient productClient;

    public OrderController(
            UserClient userClient,
            ProductClient productClient
    ) {
        this.userClient = userClient;
        this.productClient = productClient;
    }

    @GetMapping("/orders/checkout")
    public Map<String, Object> checkout() {

        return Map.of(
                "users", userClient.getUsers(),
                "products", productClient.getProducts(),
                "status", "checkout-ready"
        );
    }
}