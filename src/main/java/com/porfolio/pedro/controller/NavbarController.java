/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Navbar;
import com.porfolio.pedro.service.NavbarService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedro
 */

@RestController
public class NavbarController {
    
    @Autowired
    NavbarService service;
    
    @GetMapping("/navbar")
    @ResponseBody
    public List<Navbar> getNavbar() {
        return service.getNavbar();
    }
     
    @GetMapping("/navbar/{id}")
    @ResponseBody
    public Navbar getNavbar(@PathVariable Long id) {
        return service.getNavbar(id);
    }
    /**
    @PostMapping("/navbarreg")
    @ResponseBody
    public Navbar createNavbar(@RequestBody Navbar navbar) {
        return service.createNavbar(navbar);
    }
     */

}
