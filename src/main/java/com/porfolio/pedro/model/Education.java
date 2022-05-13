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
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String school;
    private String title;
    private String career;
    private float score;
    private int start;
    private int end;
    private String img;

    public Education() {
    }

    public Education(String school, String title,String career, float score,int start,int end, String img) {
        this.school = school;
        this.title = title;
        this.career = career;
        this.score = score;
        this.start = start;
        this.end = end;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", school=" + school + ", title=" + title + ", career=" + career+ ", score=" + score +'}';
    }
}