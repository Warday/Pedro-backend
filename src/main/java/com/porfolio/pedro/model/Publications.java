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
public class Publications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String place;
    private String title;
    private int year;
    private String DOI;

    public Publications() {
    }

    public Publications(String place, String title,int year, String DOI) {
        this.place = place;
        this.title = title;
        this.year = year;
        this.DOI = DOI;
    }

    @Override
    public String toString() {
        return "Publications{" + "id=" + id + ", place=" + place + ", title=" + title + ", year=" + year+ ", DOI=" + DOI +'}';
    }
}
