/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Awards;
import com.porfolio.pedro.service.AwardsService;
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
public class AwardsController {
    
    @Autowired
    public AwardsService service;
    
    @GetMapping("/awards")
    @ResponseBody
    public List<Awards> getAwards() {
        return service.getAwards();
    }
    
    @PostMapping("/awards/create")
    @ResponseBody
    public Awards createAwards(@RequestBody Awards awards) {
        return service.createAwards(awards);
    }
    
    @DeleteMapping("/awards/{id}")
    public void eraseAwards(@PathVariable Long id) {
        service.eraseAwards(id);
    }
    
    @GetMapping("/awards/{id}")
    @ResponseBody
    public Awards getAwards(@PathVariable Long id) {
        return service.getAwards(id);
    }
    
    @PutMapping("/awards/update")
    public void modifyAwards(@RequestBody Awards awards) {
        System.out.println(awards);
        service.modifyAwards(awards);
    }
}
