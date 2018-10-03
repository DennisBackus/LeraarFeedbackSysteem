package com.leeraar.services.security;


import com.leeraar.models.Feedback;
import com.leeraar.models.Leerling;
import com.leeraar.models.Leraar;
import com.leeraar.models.security.Authority;
import com.leeraar.repositories.AuthorityRepository;
import com.leeraar.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	public Optional<Authority> findById(Long id){
		return authorityRepository.findById(id);
	}



}
