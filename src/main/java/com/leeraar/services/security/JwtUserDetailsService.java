package com.leeraar.services.security;

import com.leeraar.dto.UserDto;
import com.leeraar.factories.JwtUserFactory;
import com.leeraar.models.Feedback;
import com.leeraar.models.security.User;
import com.leeraar.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }

    public void save(UserDto userDto) {
        Assert.notNull(userDto, "User may not be null");

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt()));
        user.setEnabled(true);
        user.setLastActiveDateTime(new Date());
        user.setLastPasswordResetDate(new Date());
        user.setFirstname("");
        user.setLastname("");

        this.userRepository.save(user);
    }
}