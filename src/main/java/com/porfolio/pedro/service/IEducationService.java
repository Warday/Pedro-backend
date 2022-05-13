/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Education;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IEducationService {
    public List<Education> getEducation();
    public Education createEducation(Education education);
    public void eraseEducation(Long id);
    public Education getEducation(Long id);
    public void modifyEducation(Education education);
}
