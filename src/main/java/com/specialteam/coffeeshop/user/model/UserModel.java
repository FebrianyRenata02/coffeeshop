package com.specialteam.coffeeshop.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String userId;

  private String username;

  private String email;

  private String password;

}
