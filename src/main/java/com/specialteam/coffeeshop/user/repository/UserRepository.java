package com.specialteam.coffeeshop.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.specialteam.coffeeshop.user.model.UserModel;

public interface UserRepository extends CrudRepository<String, UserModel> {
}
