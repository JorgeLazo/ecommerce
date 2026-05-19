package com.jorgelazo.order.client;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFallback implements ProductClient {

    @Override
    public List<Object> getProducts() {
        return List.of(
                "fallback-product-service-unavailable"
        );
    }
}