/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Education;
import com.porfolio.pedro.repository.Educationrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class EducationService implements IEducationService {

    @Autowired
    public Educationrepository repository;
    
    @Override
    public List<Education> getEducation() {
        return repository.findAll();
    }

    @Override
    public Education createEducation(Education education) {
        return repository.save(education);
    }

    @Override
    public void eraseEducation(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Education getEducation(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyEducation(Education education) {
        repository.save(education);
    }
    
}