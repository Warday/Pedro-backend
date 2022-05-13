/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pedro
 */
@Getter @Setter
public class UserDto {
    private String email;
    private String password;
    
    public UserDto() {}

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }
    
    
}

