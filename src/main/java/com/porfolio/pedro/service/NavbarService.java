/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Navbar;
import com.porfolio.pedro.repository.NavbarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class NavbarService implements INavbarService{
    @Autowired
    public NavbarRepository repository;
    
    @Override
    public List<Navbar> getNavbar() {
        return repository.findAll();
    }
    @Override
    public Navbar getNavbar(Long id) {
        return repository.findById(id).orElse(null);
    }
    
    @Override
    public Navbar createNavbar(Navbar navbar) {
        return repository.save(navbar);
    }
}
