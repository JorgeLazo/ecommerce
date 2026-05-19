package com.jorgelazo.order.service;

import com.jorgelazo.order.client.ProductClient;
import com.jorgelazo.order.client.UserClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CheckoutService {

    private final UserClient userClient;
    private final ProductClient productClient;

    public CheckoutService(
            UserClient userClient,
            ProductClient productClient
    ) {
        this.userClient = userClient;
        this.productClient = productClient;
    }

    public Map<String, Object> checkout() {

        return Map.of(
                "status", "checkout-ready",
                "users", userClient.getUsers(),
                "products", productClient.getProducts()
        );
    }

    
}