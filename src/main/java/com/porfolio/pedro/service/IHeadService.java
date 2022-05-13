/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.service;

import com.porfolio.pedro.model.Head;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface IHeadService {
    public List<Head> getHead();
    public Head getHead(Long id);
    public void modifyHead(Head head);
}
