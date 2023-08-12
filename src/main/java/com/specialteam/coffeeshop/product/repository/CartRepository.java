package com.specialteam.coffeeshop.product.repository;

import com.specialteam.coffeeshop.product.model.Cart;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {
    List<Cart> findByUserId(String userId);
}
