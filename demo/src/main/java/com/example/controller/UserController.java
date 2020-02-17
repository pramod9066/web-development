package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDTO;
import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService service;

	@PostMapping(value = "/register")
	public String register(@RequestBody UserDTO userDTO) {
		log.info("UserController :: register() : " + userDTO);
		try {
			User user = service.save(userDTO);
			log.info("UserController :: register() : " + user);
			return user.getUserName() + " Registered Successfully";

		} catch (Exception e) {
			log.error("UserController :: register() : error" + userDTO);
			log.error("UserController :: register() : " + e);
			return "Registration Failed";
		}

	}
}
