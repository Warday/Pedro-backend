/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.User;
import com.porfolio.pedro.model.dto.UserDto;
import com.porfolio.pedro.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author pedro
 */
@RestController
public class AuthController {
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    /**
    @PostMapping("/register")
    public void register(@RequestBody User user) throws Exception {
        service.createUser(user);
    }*/
}
