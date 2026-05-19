package com.jorgelazo.order.controller;

import com.jorgelazo.order.service.CheckoutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final CheckoutService service;

    public OrderController(
            CheckoutService service
    ) {
        this.service = service;
    }

    @GetMapping("/orders/checkout")
    public Map<String, Object> checkout() {
        return service.checkout();
    }
}