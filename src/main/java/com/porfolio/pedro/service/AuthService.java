/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.User;
import com.porfolio.pedro.model.dto.UserDto;
import com.porfolio.pedro.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */
@Service
public class AuthService {
    @Autowired
    AuthRepository repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UserDto userDto) {
        boolean isUserEnabled = false;
        List<User> users = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!users.isEmpty()) {
            User user = users.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), user.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
    public void createUser(User user) throws Exception{
        List<User> users = repository.findByEmailAndIsEnabledTrue(user.getEmail());
        if (!users.isEmpty()) {
            throw new Exception("El email ya está registrado.");
        } else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setEnabled(true);
            repository.save(user);
        }
    }
}
