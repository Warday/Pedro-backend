/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.pedro.controller;

import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedro
 */
@RestController
@RequestMapping("/api/v1.0")
public class TimeController {

    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {

        return Instant.now().toString();
    }
}
