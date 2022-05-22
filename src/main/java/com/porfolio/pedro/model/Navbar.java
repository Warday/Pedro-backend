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
public class Navbar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String icon;
    private String title;
    private String hashtag;
    private String facebook;
    private String instagram;
   

    public Navbar() {
    }

    public Navbar( String icon, String title, String facebook, String instagram, String hashtag) {
        this.icon = icon;
        this.title = title;
        this.hashtag=hashtag;
        this.facebook = facebook;
        this.instagram = instagram;
        
    }

    @Override
    public String toString() {
        return "Yo{" + "id=" + id + ", title=" + title + ", facebook=" + facebook + ", instagram=" + instagram + '}';
    }
}
