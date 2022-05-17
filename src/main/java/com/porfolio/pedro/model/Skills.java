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
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private float percentage;
    private String comments;

    public Skills() {
    }

    public Skills(String name, float percentage,String comments) {
        this.name = name;
        this.percentage = percentage;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Skills{" + "id=" + id + ", name=" + name + ", percentage=" + percentage + ", comments=" + comments +'}';
    }
}
