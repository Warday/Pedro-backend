/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Projects;
import com.porfolio.pedro.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class ProjectsService implements IProjectsService {
    @Autowired
    public ProjectsRepository repository;
    
    @Override
    public List<Projects> getProjects() {
        return repository.findAll();
    }

    @Override
    public Projects createProjects(Projects projects) {
        return repository.save(projects);
    }

    @Override
    public void eraseProjects(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Projects getProjects(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyProjects(Projects projects) {
        repository.save(projects);
    }
}
