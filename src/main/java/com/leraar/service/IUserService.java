package com.leraar.service;

import java.util.List;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.leraar.dto.UserDto;
import com.leraar.models.User;

public interface IUserService {

	User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
	
}
