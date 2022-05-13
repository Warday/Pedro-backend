/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Education;
import com.porfolio.pedro.service.EducationService;
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
public class EducationController {

    @Autowired
    public EducationService service;
    
    @GetMapping("/education")
    @ResponseBody
    public List<Education> getEducation() {
        return service.getEducation();
    }
    
    @PostMapping("/education/create")
    @ResponseBody
    public Education createEducation(@RequestBody Education education) {
        return service.createEducation(education);
    }
    
    @DeleteMapping("/education/{id}")
    public void eraseEducation(@PathVariable Long id) {
        service.eraseEducation(id);
    }
    
    @GetMapping("/education/{id}")
    @ResponseBody
    public Education getEducation(@PathVariable Long id) {
        return service.getEducation(id);
    }
    
    @PutMapping("/education/update")
    public void modifyEducation(@RequestBody Education education) {
        System.out.println(education);
        service.modifyEducation(education);
    }
}
