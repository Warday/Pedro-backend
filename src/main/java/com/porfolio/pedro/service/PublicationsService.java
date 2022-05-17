/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Publications;
import com.porfolio.pedro.repository.PublicationsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class PublicationsService implements IPublicationsService {
    @Autowired
    public PublicationsRepository repository;
    
    @Override
    public List<Publications> getPublications() {
        return repository.findAll();
    }

    @Override
    public Publications createPublications(Publications publications) {
        return repository.save(publications);
    }

    @Override
    public void erasePublications(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Publications getPublications(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyPublications(Publications publications) {
        repository.save(publications);
    }
}
