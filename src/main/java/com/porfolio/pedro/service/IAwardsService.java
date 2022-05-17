/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Awards;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IAwardsService {
    public List<Awards> getAwards();
    public Awards createAwards(Awards awards);
    public void eraseAwards(Long id);
    public Awards getAwards(Long id);
    public void modifyAwards(Awards awards);
}
