/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Publications;
import com.porfolio.pedro.service.PublicationsService;
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
public class PublicationsController {
    
    @Autowired
    public PublicationsService service;
    
    @GetMapping("/publications")
    @ResponseBody
    public List<Publications> getPublications() {
        return service.getPublications();
    }
    
    @PostMapping("/publications/create")
    @ResponseBody
    public Publications createPublications(@RequestBody Publications publications) {
        return service.createPublications(publications);
    }
    
    @DeleteMapping("/publications/{id}")
    public void erasePublications(@PathVariable Long id) {
        service.erasePublications(id);
    }
    
    @GetMapping("/publications/{id}")
    @ResponseBody
    public Publications getPublications(@PathVariable Long id) {
        return service.getPublications(id);
    }
    
    @PutMapping("/publications/update")
    public void modifyPublications(@RequestBody Publications publications) {
        System.out.println(publications);
        service.modifyPublications(publications);
    }
}
