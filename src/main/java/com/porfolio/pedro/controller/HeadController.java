/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.Head;
import com.porfolio.pedro.service.HeadService;
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
public class HeadController {
    
    @Autowired
    public HeadService service;
    
    @GetMapping("/head")
    @ResponseBody
    public List<Head> getHead() {
        return service.getHead();
    }
     
    @GetMapping("/head/{id}")
    @ResponseBody
    public Head getHead(@PathVariable Long id) {
        return service.getHead(id);
    }
    
    @PutMapping("/head/update")
    public void modifyHead(@RequestBody Head head) {
        System.out.println(head);
        service.modifyHead(head);
    }
}
