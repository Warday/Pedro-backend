/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Projects;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IProjectsService {
    public List<Projects> getProjects();
    public Projects createProjects(Projects projects);
    public void eraseProjects(Long id);
    public Projects getProjects(Long id);
    public void modifyProjects(Projects projects);
}
