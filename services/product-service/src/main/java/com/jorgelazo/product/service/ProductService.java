package com.jorgelazo.product.service;

import com.jorgelazo.product.entity.Product;
import com.jorgelazo.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product save(Product product){
        return repository.save(product);
    }
}