package com.leeraar.controllers;

import com.leeraar.models.security.User;
import com.leeraar.repositories.UserRepository;
import com.leeraar.services.security.JwtTokenUtilService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class UserController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtilService jwtTokenUtil;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "active", method = RequestMethod.GET)
    public ResponseEntity<?> updateActiveUserState(HttpServletRequest request) {
        String authToken = request.getHeader(tokenHeader);
        final String token = authToken.substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);

        User user = userRepository.findByUsername(username);

        user.setLastActiveDateTime(new Date());

        userRepository.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @RequestMapping("/error")
//    public String error() {
//        return "Error handling";
//    }
//
//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }




}