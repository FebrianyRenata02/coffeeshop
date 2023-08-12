package com.specialteam.coffeeshop.product.repository;

import com.specialteam.coffeeshop.product.model.Product;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    Optional<Product> findByName(String name);
}
