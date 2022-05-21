/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.repository;

import com.porfolio.pedro.model.Navbar;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pedro
 */

@Repository
public interface NavbarRepository extends JpaRepository<Navbar, Long> {
    
}
