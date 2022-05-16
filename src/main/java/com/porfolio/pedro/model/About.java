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
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String about;
   

    public About() {
    }

    public About( String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Yo{" + "id=" + id + ", acerca de=" + about + '}';
    }
}
