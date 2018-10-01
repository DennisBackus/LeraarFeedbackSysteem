package com.leraar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.User;

public interface UserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);
	
}
