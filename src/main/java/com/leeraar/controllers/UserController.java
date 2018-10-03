package com.leeraar.controllers;

import com.leeraar.dto.UserDto;
import com.leeraar.models.Feedback;
import com.leeraar.models.security.Authority;
import com.leeraar.models.security.JwtAuthenticationRequest;
import com.leeraar.models.security.User;
import com.leeraar.repositories.UserRepository;
import com.leeraar.services.security.AuthorityService;
import com.leeraar.services.security.JwtTokenUtilService;
import com.leeraar.services.security.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Optional;

@RestController
public class UserController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthorityService authorityService;


    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
    

    @PostMapping(value = "register/{roleId}")
    public ResponseEntity<?> register(@RequestBody UserDto userDto, @PathVariable Long roleId) {

        Optional<Authority> optionalAuthority = authorityService.findById(roleId);

        if (optionalAuthority.isPresent()) {

            jwtUserDetailsService.save(userDto);
            return new ResponseEntity<>("User is registered!",HttpStatus.OK);
        }


        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



//    @RequestMapping(value = "active", method = RequestMethod.GET)
//    public ResponseEntity<?> updateActiveUserState(HttpServletRequest request) {
//        String authToken = request.getHeader(tokenHeader);
//        String token = authToken.substring(7);
//        String username = jwtTokenUtil.getUsernameFromToken(token);
//
//        User user = userRepository.findByUsername(username);
//
//        user.setLastActiveDateTime(new Date());
//
//        userRepository.save(user);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }



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