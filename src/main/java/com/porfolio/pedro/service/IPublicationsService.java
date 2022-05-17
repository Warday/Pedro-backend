/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Publications;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IPublicationsService {
    public List<Publications> getPublications();
    public Publications createPublications(Publications publications);
    public void erasePublications(Long id);
    public Publications getPublications(Long id);
    public void modifyPublications(Publications publications);
}
