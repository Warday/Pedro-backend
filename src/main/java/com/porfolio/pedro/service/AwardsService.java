/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Awards;
import com.porfolio.pedro.repository.AwardsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class AwardsService implements IAwardsService {
    @Autowired
    public AwardsRepository repository;
    
    @Override
    public List<Awards> getAwards() {
        return repository.findAll();
    }

    @Override
    public Awards createAwards(Awards awards) {
        return repository.save(awards);
    }

    @Override
    public void eraseAwards(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Awards getAwards(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyAwards(Awards awards) {
        repository.save(awards);
    }
}
