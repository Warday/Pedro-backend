/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Skills;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface ISkillsService {
    public List<Skills> getSkills();
    public Skills createSkills(Skills skills);
    public void eraseSkills(Long id);
    public Skills getSkills(Long id);
    public void modifySkills(Skills skills);
}
