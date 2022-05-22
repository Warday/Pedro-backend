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
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String company;
    private String level;
    private String worktime;
    private String place;
    private String start;
    private String end;
    private String about;
    private String img;
    
    public Experience() {
    }

    public Experience(String school, String title,String career, float score,String start,String end,String about, String img) {
        this.company = company;
        this.level = level;
        this.worktime = worktime;
        this.place = place;
        this.start = start;
        this.end = end;
        this.about = about;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Experience{" + "id=" + id + ", company=" + company + ", level=" + level + ", time=" + worktime +", place=" + place + '}';
    }
}
