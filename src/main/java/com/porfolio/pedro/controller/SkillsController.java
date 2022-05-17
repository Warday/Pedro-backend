/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Skills;
import com.porfolio.pedro.service.SkillsService;
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
public class SkillsController {
    
    @Autowired
    public SkillsService service;
    
    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> getSkills() {
        return service.getSkills();
    }
    
    @PostMapping("/skills/create")
    @ResponseBody
    public Skills createSkills(@RequestBody Skills skills) {
        return service.createSkills(skills);
    }
    
    @DeleteMapping("/skills/{id}")
    public void eraseSkills(@PathVariable Long id) {
        service.eraseSkills(id);
    }
    
    @GetMapping("/skills/{id}")
    @ResponseBody
    public Skills getSkills(@PathVariable Long id) {
        return service.getSkills(id);
    }
    
    @PutMapping("/skills/update")
    public void modifySkills(@RequestBody Skills skills) {
        System.out.println(skills);
        service.modifySkills(skills);
    }
}
