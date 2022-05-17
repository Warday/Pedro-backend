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
public class Awards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private String title;
    private int year;
    private String img;

    public Awards() {
    }

    public Awards(String name, String title,int year, String img) {
        this.name = name;
        this.title = title;
        this.year = year;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Awards{" + "id=" + id + ", name=" + name + ", title=" + title + ", year=" + year +'}';
    }
}
