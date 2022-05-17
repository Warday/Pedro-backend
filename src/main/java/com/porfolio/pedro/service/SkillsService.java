/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Skills;
import com.porfolio.pedro.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class SkillsService implements ISkillsService {
    @Autowired
    public SkillsRepository repository;
    
    @Override
    public List<Skills> getSkills() {
        return repository.findAll();
    }

    @Override
    public Skills createSkills(Skills skills) {
        return repository.save(skills);
    }

    @Override
    public void eraseSkills(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Skills getSkills(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifySkills(Skills skills) {
        repository.save(skills);
    }
}
