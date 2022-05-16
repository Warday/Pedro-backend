/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import com.porfolio.pedro.model.About;
import com.porfolio.pedro.service.AboutService;
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
public class AboutController {
    @Autowired
    public AboutService service;
    
    @GetMapping("/about")
    @ResponseBody
    public List<About> getAbout() {
        return service.getAbout();
    }
     
    @GetMapping("/about/{id}")
    @ResponseBody
    public About getAbout(@PathVariable Long id) {
        return service.getAbout(id);
    }
    
    @PutMapping("/about/update")
    public void modifyAbout(@RequestBody About about) {
        System.out.println(about);
        service.modifyAbout(about);
    }
}
