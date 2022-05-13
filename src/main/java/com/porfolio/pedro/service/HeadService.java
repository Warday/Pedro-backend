/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Head;
import com.porfolio.pedro.repository.HeadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */

@Service
public class HeadService implements IHeadService{
    @Autowired
    public HeadRepository repository;
    
    @Override
    public List<Head> getHead() {
        return repository.findAll();
    }

    @Override
    public Head getHead(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modifyHead(Head head) {
        repository.save(head);
    }
    
    
}
