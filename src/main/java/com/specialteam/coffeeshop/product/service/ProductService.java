package com.specialteam.coffeeshop.product.service;

import com.specialteam.coffeeshop.product.repository.CartRepository;
import com.specialteam.coffeeshop.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;

    // @Autowired
    // private UserRepository userRepository;
}
