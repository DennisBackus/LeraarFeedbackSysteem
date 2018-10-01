package com.leraar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leraar.config.TokenProvider;
import com.leraar.models.AuthToken;
import com.leraar.models.User;

@CrossOrigin(origins = "*", maxAge = 3600)
	@RestController
	@RequestMapping("/token")
	public class AuthenticationController {

	    @Autowired
	    private AuthenticationManager authenticationManager;

	    @Autowired
	    private TokenProvider jwtTokenUtil;
	    


	    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
	    public ResponseEntity register(@RequestBody User user) throws AuthenticationException {

	        final Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        user.getUsername(),
	                        user.getPassword()
	                )
	        );
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        final String token = jwtTokenUtil.generateToken(authentication);
	        return ResponseEntity.ok(new AuthToken(token));
	    }

	}
	
	

