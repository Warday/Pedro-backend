/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.About;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IAboutService {
    public List<About> getAbout();
    public About getAbout(Long id);
    public void modifyAbout(About about);
}
