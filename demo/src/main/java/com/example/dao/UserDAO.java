package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

	User findByUsername(String username);

	User findByEmailId(String email);

	User findByPhoneNumber(Long phonenumber);

}
