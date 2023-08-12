package com.specialteam.coffeeshop.user.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackageClasses = UserController.class)
public class UserControllerAdvice extends ResponseEntityExceptionHandler {

}
