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
public class Head {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String bannerimg;
    private String name;
    private String myimg;
    private String work;
    private String home;
    private String work1;
    private String imgwork1;
    private String urlwork1;
    private String work2;
    private String imgwork2;
    private String urlwork2;
    

    public Head() {
    }

    public Head( String bannerimg, String name, String myimg, String work, String home, String work1, String imgwork1,String urlwork1, String work2, String imgwork2,String urlwork2) {
        this.bannerimg = bannerimg;
        this.name = name;
        this.myimg = myimg;
        this.work = work;
        this.home = home;
        this.work1 = work1;
        this.imgwork1 = imgwork1;
        this.urlwork1 = urlwork1;
        this.work2 = work2;
        this.imgwork2 = imgwork2;
        this.urlwork2 = urlwork2;
    }

    @Override
    public String toString() {
        return "Yo{" + "id=" + id + ", name=" + name + ", work=" + work + ", home=" + home + ", work1=" + work1 + ", work2=" + work2+ '}';
    }
    
}
