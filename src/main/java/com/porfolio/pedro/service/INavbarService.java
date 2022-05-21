/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Navbar;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface INavbarService{
    public List<Navbar> getNavbar();
    public Navbar getNavbar(Long id);
    public Navbar createNavbar(Navbar navbar);
    
}
