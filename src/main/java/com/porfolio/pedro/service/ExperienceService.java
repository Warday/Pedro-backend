/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Experience;
import com.porfolio.pedro.repository.Experiencerepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class ExperienceService implements IExperienceService {
    
    @Autowired
    public Experiencerepository repository;
    
    @Override
    public List<Experience> getExperience() {
        return repository.findAll();
    }

    @Override
    public Experience createExperience(Experience experience) {
        return repository.save(experience);
    }

    @Override
    public void eraseExperience(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Experience getExperience(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyExperience(Experience experience) {
        repository.save(experience);
    }
    
}
