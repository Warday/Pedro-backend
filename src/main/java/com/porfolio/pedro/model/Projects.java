/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pedro
 */

@Getter @Setter
@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private int year;
    private String description;
    private String link;

    public Projects() {
    }

    public Projects(String name, String description,int year,String link) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Projects{" + "id=" + id + ", name=" + name + ", description=" + description +'}';
    }
}
