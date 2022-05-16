/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;
import com.porfolio.pedro.model.Experience;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IExperienceService {
    public List<Experience> getExperience();
    public Experience createExperience(Experience experience);
    public void eraseExperience(Long id);
    public Experience getExperience(Long id);
    public void modifyExperience(Experience experience);
}
