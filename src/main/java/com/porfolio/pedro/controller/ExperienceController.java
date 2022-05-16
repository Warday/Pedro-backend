/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Experience;
import com.porfolio.pedro.service.ExperienceService;
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
public class ExperienceController {
    @Autowired
    public ExperienceService service;
    
    @GetMapping("/experience")
    @ResponseBody
    public List<Experience> getExperience() {
        return service.getExperience();
    }
    
    @PostMapping("/experience/create")
    @ResponseBody
    public Experience createExperience(@RequestBody Experience experience) {
        return service.createExperience(experience);
    }
    
    @DeleteMapping("/experience/{id}")
    public void eraseExperience(@PathVariable Long id) {
        service.eraseExperience(id);
    }
    
    @GetMapping("/experience/{id}")
    @ResponseBody
    public Experience getExperience(@PathVariable Long id) {
        return service.getExperience(id);
    }
    
    @PutMapping("/experience/update")
    public void modifyExperience(@RequestBody Experience experience) {
        System.out.println(experience);
        service.modifyExperience(experience);
    }
}
