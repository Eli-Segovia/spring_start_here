package com.segovia.tutorials.springboot.a3_full_service_example.service;

import com.segovia.tutorials.springboot.a3_full_service_example.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProdcut(Product p) {
        products.add(p);
    }

    public List<Product> findAll() {
        return products;
    }
}
