package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.dto.UserDTO;
import com.example.model.User;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserDAO dao;

	public User save(UserDTO userDTO) {
		log.info("UserService :: svae() : " + userDTO);

		User user = new User();
		user.setUserName(userDTO.getUserName());
		user.setDob(userDTO.getDob());
		user.setPhoneNumber(userDTO.getPhoneNumber());
		user.setEmailId(userDTO.getEmailId());
		user.setGender(userDTO.getGender());
		user.setCountry(userDTO.getCountry());

		log.info("UserService :: save() : user data " + user);
		User savedUser = dao.save(user);
		log.info("UserService :: save() : savedUser data " + savedUser);
		
		return savedUser;
	}

}
