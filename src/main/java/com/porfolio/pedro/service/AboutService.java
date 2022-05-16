/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.About;
import com.porfolio.pedro.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class AboutService implements IAboutService{
    @Autowired
    public AboutRepository repository;
    
    @Override
    public List<About> getAbout() {
        return repository.findAll();
    }

    @Override
    public About getAbout(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyAbout(About about) {
        repository.save(about);
    }
}
