package com.specialteam.coffeeshop.response;

import com.specialteam.coffeeshop.user.dto.UserDto;

import lombok.Data;

@Data
public class UserResponse {
  private int statusCode;
  private UserDto dto;
  private String errorMessage;
}
