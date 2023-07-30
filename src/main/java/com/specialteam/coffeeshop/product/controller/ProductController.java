package com.specialteam.coffeeshop.product.controller;

import com.specialteam.coffeeshop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Override
    public String toString() {
        return "ProductController []";
    }

    @Autowired
    private ProductService service;
}
