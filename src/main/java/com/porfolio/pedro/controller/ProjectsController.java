/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Projects;
import com.porfolio.pedro.service.ProjectsService;
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
public class ProjectsController {
    
    @Autowired
    public ProjectsService service;
    
    @GetMapping("/projects")
    @ResponseBody
    public List<Projects> getProjects() {
        return service.getProjects();
    }
    
    @PostMapping("/projects/create")
    @ResponseBody
    public Projects createProjects(@RequestBody Projects projects) {
        return service.createProjects(projects);
    }
    
    @DeleteMapping("/projects/{id}")
    public void eraseProjects(@PathVariable Long id) {
        service.eraseProjects(id);
    }
    
    @GetMapping("/projects/{id}")
    @ResponseBody
    public Projects getProjects(@PathVariable Long id) {
        return service.getProjects(id);
    }
    
    @PutMapping("/projects/update")
    public void modifyProjects(@RequestBody Projects projects) {
        System.out.println(projects);
        service.modifyProjects(projects);
    }
}
